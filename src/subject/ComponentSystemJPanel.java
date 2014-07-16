package subject;
import interfaces.Subject;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.Component;
import components.DrawableComponent;

/**
 * @author Ivan Poza
 *
 *  Observer pattern. Class Subject that is in charge of inform of a change to all the
 *  observer that have registered using its method register before.
 *  It is implemented as a JPanel and intended as a system of components (it could
 *  be a composite pattern too, but it has been thought as a observer pattern as
 *  it has similar behaviour)
 */
public class ComponentSystemJPanel extends JPanel implements Subject {

	private static final long serialVersionUID = 1L;
	private List<Component> observers = new ArrayList<Component>();
	
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

	// access method to the system from the application
    public void startJPanel ()
    {        
    	JFrame app = new JFrame("Computer Science");
        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        app.setSize(WIDTH, HEIGHT);
        app.setResizable(false);
        app.getContentPane().add(this);
        app.setVisible(true);
        
        // Notify the observers
        notifyObservers();
    }
	
	@Override
	public void register(Component obj) {
		observers.add(obj);		
	}

	@Override
	public void unregister(Component obj) {
		observers.remove(obj);		
	}
	
	/**
     * 絵の動きのシナリオ (runScenario())
     */
	@Override
	public void notifyObservers() {
		// Notifying all the registered observers of a change in the system
		for (int i = 0; true; i++)
        {        	
        	for (Component observer : observers) {
        		((DrawableComponent)observer).update(); // move() and paint()
            }
        	pause();
        }
	}
	
	/**
     * PictureView の draw メソッドを呼んで画面を描き直した後、
     * 100 ミリ秒一時停止する。
     */
    private void pause() {
        repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
    
    @Override
    /**
     * Overriding the paintComponent as is the only one that call for every change
     * in the JPanel. So it is kind of a notifyObservers() method too.
     * First notification is 1. Move!, then second one is 2. Get Painted!
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Collections.sort(observers);
        for (Component observer : observers) {
        	((DrawableComponent)observer).draw(g);
        }
    }

}
