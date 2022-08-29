package bai02;

public class DemoPoint {

	public static void main(String[] args) {
		Point p = new Point("A", 1, 2, 3);
		
		System.out.println(p);
		System.out.println(p.negate());
		System.out.println("Khoang cach tu goc O: " + p.getDistance());
	}

}
