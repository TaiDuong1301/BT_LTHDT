package bai07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate NSX;
    private LocalDate NHH;
    /**
     * Constructor
     * @param maHang
     * @param tenHang
     * @param donGia
     * @param nSX
     * @param nHH
     */
    public HangThucPham(String maHang) throws Exception{
        if (!maHang.equals("")) {
            this.maHang = maHang;
        }
        else
            throw new Exception("Ma hang bi rong!");
        this.setTenHang("xxx");
        this.setDonGia((double) 0);
        this.setNSX(LocalDate.now());
        this.setNHH(NSX);
    }
    public HangThucPham(String maHang, String tenHang, Double donGia, LocalDate nSX, LocalDate nHH) throws Exception{
        if (!maHang.equals("")) {
            this.maHang = maHang;
        }
        else
            throw new Exception("Ma hang bi rong!");
        setTenHang(tenHang);
        setDonGia(donGia);
        setNSX(nSX);
        setNHH(nHH);
    }
    /**
     * Get Ma hang
     * @return
     */
    public String getMaHang() {
        return maHang;
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
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
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
