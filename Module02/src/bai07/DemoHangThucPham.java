package bai07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DemoHangThucPham {
    static Scanner sc = new Scanner(System.in);

    public static HangThucPham Input() throws Exception{
        String id, name, MFG, EXP; // Manufacturing Date, Expiry date
        double price;
        System.out.println("Nhap ma hang: ");
        id = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        name = sc.nextLine();
        System.out.println("Nhap don gia: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap ngay san xuat: ");
        MFG = sc.nextLine();
        System.out.println("Nhap ngay het han: ");
        EXP = sc.nextLine();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ngaySX = LocalDate.parse(MFG, dtf);
		LocalDate ngayHH = LocalDate.parse(EXP, dtf);

        HangThucPham tp = new HangThucPham(id, name, price, ngaySX, ngayHH);
        return tp;
    }



    public static void main(String[] args) {
        try {
            HangThucPham tp1, tp2, tp3;
            tp1 = Input();
            tp2 = Input();
            tp3 = Input();
            
            System.out.println(String.format("%-10s %-20s %15s %-15s %-15s %-15s", "Ma_hang", "Ten_hang", "Don_gia", "Ngay_san_xuat", "Ngay_het_han", "Ghi_chu"));
            System.out.println(tp1);
            System.out.println(tp2);
            System.out.println(tp3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
