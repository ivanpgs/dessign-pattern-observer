package interfaces;

/**
 * @author Ivan Poza
 * 
 * Interface that define the operation move to make an object movable
 * Also define two different orbital movement constant (along the x and y axis) and also a non
 * movement constant.
 *
 */
public interface Movable {

	final static int NO_SPINING = 0; // No movement
	final static int SPIN_ORBITAL_X_AXIS = 1;
	final static int SPIN_ORBITAL_Y_AXIS = 2;
	
	public void move ();

}
