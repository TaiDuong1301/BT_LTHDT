package bai03;

public class Cylinder {
	private int r;
	private int h;
	
	/**
	 * get & set
	 */
	public int getr() {
		return r;
	}
	public void setr(int r) {
		this.r = r;
	}
	public int geth() {
		return h;
	}
	public void seth(int h) {
		this.h = h;
	}
	/**
	 * Constructor default
	 */
	public Cylinder() {
		super();
	}
	/**
	 * Constructor
	 * @param r
	 * @param h
	 */
	public Cylinder(int r, int h) {
		super();
		this.r = r;
		this.h = h;
	}
	/**
	 * Method
	 */
	public double dienTichXungQuanh() {
		return 2 * Math.PI * r * h;
	}
	public double dienTichToanPhan() {
		//Stp = 2πr^2 + 2πrh = 2πr(r+h)
		return 2 * Math.PI * r * (r + h);
	}
	public double theTich() {
		//V=πr²h
		return Math.PI * r * r * h;
	}
}
