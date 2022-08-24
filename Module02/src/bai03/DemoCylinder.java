package bai03;

public class DemoCylinder {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(5, 6);
		
		System.out.println("Sxq = " + c.dienTichXungQuanh());
		System.out.println("Stp = " + c.dienTichToanPhan());
		System.out.println("V = " + c.theTich());
	}
}
