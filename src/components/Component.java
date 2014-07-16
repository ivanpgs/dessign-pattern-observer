package components;
import java.awt.Color;

import beans.SpacialCoordinate;
/**
 * @author Ivan Poza
 *
 * Basic object of the system called Component.
 * Implements the interface comparable to be sorted easily
 */
public abstract class Component implements Comparable<Component> {
	
	/** 画面の一辺の長さ */
	protected static final int SIZE = 600;
	
	/** X座標, Y座標, Z座標 */
	private SpacialCoordinate spacialCoordinate = null;
    /** 大きさ */
    private double rs;
	/** 図形の色 */
    private Color color;
    
    /**
     * 新しい図形を作成し、その図形の識別番号を返す
     * 
     * @param spacialCoordinate 
     * 			  (X 座標, Y 座標, Z 座標)
     * @param radius
     *            半径 (大きさ)
     * @param color
     *            色
     * @return 作成した図形の番号
     */
    public Component (SpacialCoordinate spacialCoordinate, double radius, Color color) {
        setSpacialCoordinate(spacialCoordinate);
    	setRs(radius);
        setColor(color);
    }    
    
    /**
     * Z軸の順番によるソート(大きい順) 
     */
    @Override
    public int compareTo(Component otherComponent)
    {
       	if (getSpacialCoordinate().getZ() < otherComponent.getSpacialCoordinate().getZ())
    	{
    		return 1;
    	}
    	else if (getSpacialCoordinate().getZ() > otherComponent.getSpacialCoordinate().getZ())
    	{
    		return -1;
    	}
    	else
    	{
    		return 0;
    	}
    }   
    
    /**
     * 図形の位置を動かす
     * 
     * @param newCoordinate (X 座標, Y 座標, Z 座標)
     */
    public void move(SpacialCoordinate newCoordinate) {
        setSpacialCoordinate(newCoordinate);
    }
    
    /**
     * Getter and setters
     */
    public SpacialCoordinate getSpacialCoordinate() {
		return this.spacialCoordinate;
	}

	public void setSpacialCoordinate(SpacialCoordinate spacialCoordinate) {
		this.spacialCoordinate = spacialCoordinate;
	}
	
    public void setColor(Color color) {
		this.color = color;
	}

	public double getRs() {
		return this.rs;
	}

	public void setRs(double rs) {
		this.rs = rs;
	}

	public Color getColor() {
		return this.color;
	}
}
