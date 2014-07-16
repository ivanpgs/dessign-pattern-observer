package components;
import java.awt.Color;
import java.awt.Graphics;

import beans.Movement;
import beans.SpacialCoordinate;

/**
 * @author Ivan Poza
 * 
 * Class that extends the Drawable component giving it the ability to take the rectangle shape
 *
 */
public class RectangleDrawableComponent extends DrawableComponent {

	public RectangleDrawableComponent(SpacialCoordinate spacialCoordinate, double radius, Color color) {
		super(spacialCoordinate, radius, color);		
	}
	
	public RectangleDrawableComponent (SpacialCoordinate spacialCoordinate, double radius, Color color, int spinDirection) {
		super(spacialCoordinate, radius, color);
		Movement movement = new Movement (spinDirection,1,1);		
		setMovement(movement);
	}

	@Override	
	/**
	 * Draw the component within the graphic with an oval shape
	 */
	public void draw (Graphics g) {
		super.draw(g);
		g.fillRect((int) calculatedX , (int) calculatedY, (int) calculatedR * 2, (int) calculatedR * 2);		
	}
	
}
