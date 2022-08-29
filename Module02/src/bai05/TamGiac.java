package bai05;

public class TamGiac {
    private float ma, mb, mc;
    /**
     * Constructor
     */
    public TamGiac() {
        //this(0f, 0f, 0f);
    }
    public TamGiac(float ma, float mb, float mc) {
        if (ma + mb > mc || ma + mc > mb || mb + mc > ma) {
            setMa(ma);
            setMb(mb);
            setMc(mc);
        }
        else
        	ma = mb = mc = 0;
    }
    /**
     * Getter & Setter
     * @return
     */
    public float getMa() {
        return ma;
    }
    public void setMa(float ma) {
        this.ma = (ma < 0) ? 0 : ma;
    }
    public float getMb() {
        return mb;
    }
    public void setMb(float mb) {
        this.mb = (mb < 0) ? 0 : mb;
    }
    public float getMc() {
        return mc;
    }
    public void setMc(float mc) {
        this.mc = (mc < 0) ? 0 : mc;
    }
    public float ChuVi() {
        return ma + mb + mc;
    }
    public double DienTich() {
        float p = (ma + mb + mc) / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
    }
    public String KieuTamGiac(){
        if (ma == 0) {
            return "Khong phai tam giac";
        }
        else if ((ma == mb) && (mb == mc)) {
            return "Tam giac deu";
        }
        else if (ma == mb || mb == mc || ma == mc) {
            return "Tam giac can";
        }
        else if ((ma * ma == mb * mb + mc * mc) || (mb * mb == ma * ma + mc * mc) || (mc * mc == ma * ma + mb * mb)) {
            return "Tam giac vuong";
        }
        else if (((ma * ma + mb * mb == mc * mc) && (ma == mb)) || ((ma * ma + mc * mc == mb * mb) && (ma == mc)) || ((mb * mb + mc * mc == ma * ma) && (mb == mc))) {
            return "Tam giac vuong can";
        }
        return "Tam giac thuong";
    }
    public String toString() {
        return String.format("%6.2f %6.2f %6.2f %-20s %6.2f %6.2f", ma, mb, mc, KieuTamGiac(), ChuVi(), DienTich());
    }
    
}
