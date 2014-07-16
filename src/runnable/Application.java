package runnable;
import interfaces.Movable;

import java.awt.Color;

import subject.ComponentSystemJPanel;
import beans.SpacialCoordinate;
import components.Component;
import components.DrawableComponent;
import components.OvalDrawableComponent;
import components.RectangleDrawableComponent;

/**
 * @author Ivan Poza
 * 
 * Main application created following the pattern Subject - Observer
 * Created 3 observers (Components) that register with the subject (ComponentSystemJPanel)
 * to be informed of any update in the component system drawed as a JPanel
 *
 */
public class Application {

    public static void main(String[] args) {
        
    	// Create the observers
    	Component c1 = new OvalDrawableComponent(new SpacialCoordinate(100, 100, 0), 20D, Color.YELLOW, Movable.SPIN_ORBITAL_X_AXIS);
    	Component c2 = new RectangleDrawableComponent(new SpacialCoordinate(-100, -150, 0), 20D, Color.BLUE, Movable.SPIN_ORBITAL_Y_AXIS);
    	Component c3 = new RectangleDrawableComponent(new SpacialCoordinate(30, 0, 400), 40D, Color.RED, Movable.NO_SPINING);
    	
    	// Create the subject
    	ComponentSystemJPanel cs = new ComponentSystemJPanel();
    	cs.register(c1);
    	cs.register(c2);
    	cs.register(c3);
    	
    	// Attach observer to subject
    	((DrawableComponent)c1).setSubject(cs);
        ((DrawableComponent)c2).setSubject(cs);
    	
    	// Start 
    	cs.startJPanel();
    }
	
}
