package bai06;

public class DemoDangKyXe {
    public static void main(String[] args) {
        ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyen Van A", "Ford", 100, 35000000);
        ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Nguyen Thi B", "Ranger", 3000, 2000000000);
        ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyen Minh C", "Landscape", 1500, 1000000000);

        System.out.println(String.format("%-20s %-10s %10s %15s %15s", "Chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai dong"));
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
    }
}
