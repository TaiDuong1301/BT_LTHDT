package bai13;

import java.util.Scanner;

public class QuanLyCongNhan {
    static Scanner sc = new Scanner(System.in);
    public static String inputString(String s) {
        System.out.println(s);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        CongNhan cn1 = new CongNhan("001", "Nguyen Van", "A", 50);
        CongNhan cn2 = new CongNhan("002", "Nguyen Van", "B", 150);
        CongNhan cn3 = new CongNhan("003", "Tran Van", "C", 300);
        CongNhan cn4 = new CongNhan("004", "Tran Thi", "D", 400);
        CongNhan cn5 = new CongNhan("005", "Duong Van", "Tai", 500);

        DanhSachCongNhan dscn = new DanhSachCongNhan(5);
        dscn.themCongNhan(cn1);
        dscn.themCongNhan(cn2);
        dscn.themCongNhan(cn3);
        dscn.themCongNhan(cn4);
        dscn.themCongNhan(cn5);

        System.out.println(dscn);

        String maCN = inputString("Nhap ma cong nhan can xoa: ");
        if (dscn.xoaCongNhan(maCN))
            System.out.println("Da xoa cong nhan" + maCN + " khoi danh sach");
        else
            System.out.println("Khong co cong nhan " + maCN + " trong danh sach");
        
        System.out.println(dscn);

        System.out.println("\n");
        System.out.println("Danh sach cong nhan lam tren 200 sp: \n");
        dscn.dsCN200();

        System.out.println("Danh sach cong nhan sap xep theo so san pham:");
        dscn.sort();
        System.out.println(dscn);
    }
}
