package bai12_CD;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
    private String maCD;
    private String tuaCD;
    private int soBaiHat;
    private float giaThanh;
    //Getter
    public String getMaCD() {
        return maCD;
    }
    public String getTuaCD() {
        return tuaCD;
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }
    public float getGiaThanh() {
        return giaThanh;
    }
    //Setter
    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    /**
     * 
     * @param soBaiHat
     * @throws Exception
     */
    public void setSoBaiHat(int soBaiHat) throws Exception {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else
            throw new Exception("1");
    }
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    public CD(String maCD, String tuaCD, int soBaiHat, float giaThanh) {
        try {
            if (maCD != null) {
                this.maCD = maCD;
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        Locale lc = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
        String s = "";
        s += String.format("|%10s|%10s|%10s|%10s|", getMaCD(), getTuaCD(), getSoBaiHat(), nf.format(getGiaThanh()));
        return s;
    }
}
