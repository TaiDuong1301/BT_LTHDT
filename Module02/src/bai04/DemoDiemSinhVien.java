package bai04;

import java.util.Scanner;

public class DemoDiemSinhVien {
	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien(1, "Nguyen Van A", 8, 9);
		DiemSinhVien sv2 = new DiemSinhVien(2, "Nguyen Van B", 5, 5);
		DiemSinhVien sv3 = new DiemSinhVien();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println(String.format("%6s %-20s %10s %10s %10s", "MSSV", "Ho ten", "Diem LT", "Diem TH", "Diem TB"));
		System.out.println(sv1);
	}
}
