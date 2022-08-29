package bai01;

public class TestToaDo {

	public static void main(String[] args) {
		ToaDo td1 = new ToaDo();
		ToaDo td2 = new ToaDo("B", 3, 4);
		
		td1.setTen("A");
		td1.setX(6);
		td1.setY(8);
		
		System.out.println(td1.getThongTin());
		System.out.println(td2.getThongTin());
		System.out.println(td1);
		System.out.println(td2);
		
	}

}
