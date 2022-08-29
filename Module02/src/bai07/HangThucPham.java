package bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private int donGia;
    private LocalDate NSX;
    private LocalDate NHH;
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) throws Exception {
        if (!maHang.equals("")) {
            this.maHang = maHang;
        }
        else
            throw new Exception("Error: Empty Ma Hang");
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if (!tenHang.trim().equals(""))
            this.tenHang = tenHang;
        else
            this.tenHang = "xxx";
    }
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia < 0 ? 0 : donGia;
    }
    public LocalDate getNSX() {
        return NSX;
    }
    public void setNSX(LocalDate nSX) {
        if (nSX.isBefore(LocalDate.now()))
            NSX = nSX;
        else
            NSX = LocalDate.now();
    }
    public LocalDate getNHH() {
        return NHH;
    }
    public void setNHH(LocalDate nHH) {
        if (nHH.isBefore(NSX))
            NHH = nHH;
        else
            NHH = NSX;
    }
    /**
     * Constructor
     * @param maHang
     * @param tenHang
     * @param donGia
     * @param nSX
     * @param nHH
     */
    public HangThucPham(String maHang, String tenHang, int donGia, LocalDate nSX, LocalDate nHH) {
        try {
            setMaHang(maHang);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setTenHang(tenHang);
        setDonGia(donGia);
        setNSX(nSX);
        setNHH(nHH);
    }
    public HangThucPham(String maHang) {
        try {
            setMaHang(maHang);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tenHang = "xxx";
        donGia = 0;
        NSX = LocalDate.now();
        NHH = NSX;
    }
    public boolean hetHan() {
        return NHH.isBefore(LocalDate.now()) ? true : false;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngaySX = dtf.format(NSX);
        String ngayHH = dtf.format(NHH);
        return String.format("%-10s %-20s %15s %-15s %-15s %-15s", maHang, tenHang, df.format(donGia), ngaySX, ngayHH, hetHan() ? "Hang het han" : "");
    }
}
