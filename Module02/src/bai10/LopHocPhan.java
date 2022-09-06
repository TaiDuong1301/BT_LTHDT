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
        this.dsSV = new Sinhvien[4];
    }

    
}
