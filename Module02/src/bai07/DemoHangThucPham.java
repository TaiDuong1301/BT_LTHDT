package bai07;

import java.time.LocalDate;

public class DemoHangThucPham {
    public static void main(String[] args) {
        HangThucPham tp1 = new HangThucPham("001");
        HangThucPham tp2 = new HangThucPham("002", "Rice", 100000, LocalDate.of(2022, 9, 1), LocalDate.of(2022, 12, 1));
        HangThucPham tp3 = new HangThucPham("003", "Banana", 123456789, LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));

        System.out.println(String.format("%-10s %-20s %15s %-15s %-15s %-15s", "Ma_hang", "Ten_hang", "Don_gia", "Ngay_san_xuat", "Ngay_het_han", "Ghi_chu"));
        System.out.println(tp1);
        System.out.println(tp2);
        System.out.println(tp3);
    }
}
