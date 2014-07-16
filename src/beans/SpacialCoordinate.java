package beans;

/**
 * @author Ivan Poza
 *
 * Bean created to store the spacial coordinates x, y and z of an object.
 * For the better maintenance has been stored in this bean. Also to be reusable
 * for other objects that can make use of it.
 */
public class SpacialCoordinate {
	
	private double x;
	private double y;
	private double z;
		
	public SpacialCoordinate (double x, double y, double z)
	{
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return this.z;
	}

	public void setZ(double z) {
		this.z = z;
	}
}
