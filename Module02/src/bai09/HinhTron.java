package bai09;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;
    /**
     * Tinh chu vi
     * @return chu vi hinh tron
     */
    public double tinhChuVi() {
        return 2 * banKinh * Math.PI;
    }
    /**
     * Tinh dien tich
     * @return dien tich hinh tron
     */
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    @Override
    public String toString() {
        return String.format("Dien tich va chu vi hinh tron tam %s co ban kinh %.2fm la %.2f va %.2f", tam.toString(), banKinh, tinhDienTich(), tinhChuVi());
    }
    //Constructor
    public HinhTron() {
    }
    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }
    //Getter
    public ToaDo getTam() {
        return tam;
    }
    public double getBanKinh() {
        return banKinh;
    }
    //Setter
    public void setTam(ToaDo tam) {
        this.tam = tam;
    }
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
}
