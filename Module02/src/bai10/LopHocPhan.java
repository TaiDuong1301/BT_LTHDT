package bai10;

public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private SinhVien[] dsSV;

    public int getSoLuongSV() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("_Ma LHP: %s\n_Ten LHP: %s\n_GV giang day: %s\n_Thong tin buoi hoc: %s", maLHP, tenLHP, tenGV, thongTinLopHoc);
    }

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = new SinhVien[4];
    }
    //Getter
    public String getMaLHP() {
        return maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public SinhVien[] getDsSV() {
        return dsSV;
    }
    // Setter
    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public void setDsSV(SinhVien[] dsSV) {
        this.dsSV = dsSV;
    }

    
}
