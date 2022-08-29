package bai06;

public class ThongTinDangKyXe {
    private String chuXe;
    private String loaiXe;
    private int triGia;
    private int dungTich;
    /**
     * Getter and Setter
     * @return
     */
    public String getChuXe() {
        return chuXe;
    }
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    }
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    public int getTriGia() {
        return triGia;
    }
    public void setTriGia(int triGia) {
        if (triGia >= 0) {
            this.triGia = triGia;
        }
        else
            this.triGia = 0;
    }
    public int getDungTich() {
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        if (dungTich >= 0)
            this.dungTich = dungTich;
        else
            this.dungTich = 0;
    }
    /**
     * Constructor
     */
    public ThongTinDangKyXe() {
    }
    public ThongTinDangKyXe(String chuXe, String loaiXe, int dungTich, int triGia) {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.triGia = triGia;
        this.dungTich = dungTich;
    }
    public int Thue() {
        if (dungTich < 100) {
            return triGia / 100;
        }
        else if (dungTich <= 200) {
            return triGia / 100 * 3;
        }
        return triGia / 100 * 5;
    }
    public String toString() {
        return String.format("%-20s %-10s %10d %15d %15d", chuXe, loaiXe, dungTich, triGia, Thue());
    }
}
