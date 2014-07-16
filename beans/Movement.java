package beans;

/**
 * @author Ivan Poza
 *
 * Bean created to help the Movable objects with the movement attributes.
 * If there is any need to make changes to that movement attributes then it will
 * be only needed to change this class instead of changing the attributes in the
 * Movable object class.
 */
public class Movement {

	private int spinDirection;
	private int actualSpinAngle;
	private int spinAngleVariation;
	
	public Movement (int spinDirection, int actualSpinAngle, int spinAngleVariation)
	{
		setSpinDirection(spinDirection);
		setSpinAngleVariation(actualSpinAngle);
		setSpinAngleVariation(spinAngleVariation);
	}
	
	public int getSpinDirection() {
		return this.spinDirection;
	}

	public void setSpinDirection(int spinDirection) {
		this.spinDirection = spinDirection;
	}

	public int getSpinAngleVariation() {
		return this.spinAngleVariation;
	}

	public void setSpinAngleVariation(int spinAngleVariation) {
		this.spinAngleVariation = spinAngleVariation;
	}

	public int getActualSpinAngle() {
		return this.actualSpinAngle;
	}

	public void setActualSpinAngle(int actualSpinAngle) {
		this.actualSpinAngle = actualSpinAngle;
	}
	
}
