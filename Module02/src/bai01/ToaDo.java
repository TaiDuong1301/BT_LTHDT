package bai01;

public class ToaDo {
	private int x;
	private int y;
	private String ten;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	/**
	 * Constructor
	 */
	public ToaDo() {
		super();
	}
	public ToaDo(String ten, int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	public String getThongTin() {
		return ten + "(" + x + ", " + y + ")";
	}
	@Override
	public String toString() {
		return ten + "(" + x + ", " + y + ")";
	}
	
	
}
