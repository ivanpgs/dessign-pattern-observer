package components;
import interfaces.Drawable;
import interfaces.Movable;
import interfaces.Observer;
import interfaces.Subject;

import java.awt.Color;
import java.awt.Graphics;

import subject.ComponentSystemJPanel;
import beans.Movement;
import beans.SpacialCoordinate;

/**
 * @author Ivan Poza
 * 
 * Class that extends the base class of the system (Component) and implements the interfaces:
 * 
 * Observer (implementing the Observer pattern behaviour)
 * Drawable (a component that can be drawed within a graphic)
 * Movable (a component that have the ability to move)
 *
 */
public abstract class DrawableComponent extends Component implements Observer, Drawable, Movable {

	protected double calculatedD = 0;
	protected double calculatedR = 0;
	protected double calculatedX = 0;
	protected double calculatedY = 0;
	
	private ComponentSystemJPanel mySubject = null;
	private Movement movement = null;

	public DrawableComponent(SpacialCoordinate spacialCoordinate, double radius, Color color) {
		super(spacialCoordinate, radius, color);		
	}
	
	public DrawableComponent(SpacialCoordinate spacialCoordinate, double radius, Color color, int spinDirection) {
		super(spacialCoordinate, radius, color);
		Movement movement = new Movement (spinDirection,1,1);		
		setMovement(movement);
	}
	
	@Override
	/**
	 * Method that move the object spinning round an axis (x or y) making use of the
	 * local attribute movement.spinDirection. Every time is invoked use the attribute
	 * movement.actualSpinAngle to specified the angle and update it for the next
	 * movement adding the value of the attribute movement.spinAngleVariation (1 by default)
	 */
	public void move () {		
		if (movement != null)
		{
			double theta = 2.0 * Math.PI * movement.getActualSpinAngle() / 50.0;
			double nextX = 0;
			double nextY = 0;
			double nextZ = 0;
			if (movement.getSpinDirection() == Movable.SPIN_ORBITAL_X_AXIS)
			{
				nextX = 300.0 * Math.cos(theta + 1.0);
				nextY = 10;
				nextZ = 300.0 * Math.sin(theta + 1.0) + 300;
				setSpacialCoordinate(new SpacialCoordinate(nextX,nextY,nextZ));			
			}
			else if (movement.getSpinDirection() == Movable.SPIN_ORBITAL_Y_AXIS)
			{
				nextX = 30;
				nextY = 300.0 * Math.cos(theta);
				nextZ = 250.0 * Math.sin(theta) + 250;	
				setSpacialCoordinate(new SpacialCoordinate(nextX,nextY,nextZ));
			}
			else if (movement.getSpinDirection() == Movable.NO_SPINING)
			{
				// No movement
			}
			int nextMovementAngle = movement.getActualSpinAngle() + movement.getSpinAngleVariation();
			movement.setActualSpinAngle(nextMovementAngle);
		}
	}
	
	/**
	 * Calculate the graphic coordinates to draw the object based in the below equations
	 * using also the local spacial coordinates of the Component object
	 * Also get the color of the object.
	 * This is the Drawable base draw method. The Drawable children will have further
	 * behaviour such as the shape of the object.
	 */
	public void draw (Graphics graphArea){
		// 一点透視図法による描画
        final double CENTER = SIZE / 2.0;
        calculatedD = CENTER / (getSpacialCoordinate().getZ() + CENTER);
        calculatedR = getRs() * calculatedD;
        calculatedX = getSpacialCoordinate().getX() * calculatedD - calculatedR + CENTER;
        calculatedY = getSpacialCoordinate().getY() * calculatedD - calculatedR + CENTER;
        graphArea.setColor(getColor());
	}
	
	@Override
	/**
	 * This is the update() method using by the Subject (Observer Pattern) to warn the Observer
	 * that the system had a changed and the component should react at this change. 
	 * In this case the reaction is to move (no need any parameter because the behaviour
	 * is define by local attributes and equations)
	 */
	public void update ()
	{
		move();
	}

	
	/**
     * Getter and setters
     */
    public void setSubject(Subject sub) {
        mySubject = (ComponentSystemJPanel) sub;
    }
    
    public Movement getMovement() {
		return this.movement;
	}

	public void setMovement(Movement movement) {
		this.movement = movement;
	}
}
