package bai04;

import java.util.Scanner;

public class DemoDiemSinhVien {
	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien(1, "Nguyen Van A", 8.6f, 9);
		DiemSinhVien sv2 = new DiemSinhVien();
		DiemSinhVien sv3 = new DiemSinhVien();
		sv2.setMaSV(2);
		sv2.setHoTen("Nguyen Van B");
		sv2.setDiemLT(8);
		sv2.setDiemTH(7.8f);
		
		System.out.println("Nhap ma so sinh vien sv3: ");
		Scanner sc = new Scanner(System.in);
		int masv = sc.nextInt();
		System.out.println("Nhap ho va ten cua sinh vien sv3: ");
		sc.nextLine();
		String hoten = sc.nextLine();
		System.out.println("Nhap diem ly thuyt sinh vien sv3: ");
		float diemlt = sc.nextFloat();
		System.out.println("Nhap diem thuc hanh cua sinh vien sv3: ");
		float diemth = sc.nextFloat();
		
		sv3 = new DiemSinhVien(masv, hoten, diemlt, diemth);
		
		System.out.println(String.format("%6s %-20s %10s %10s %10s", "MSSV", "Ho ten", "Diem LT", "Diem TH", "Diem TB"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		sc.close();
	}
}
