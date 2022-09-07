package bai12;

public class CD {
    private String maCD;
    private String tuaCD;
    private int soBaiHat;
    private float giaThanh;

    //Constructor
    public CD() {
    }

    public CD(String maCD, String tuaCD, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    //Property get
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

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD [giaThanh=" + giaThanh + ", maCD=" + maCD + ", soBaiHat=" + soBaiHat + ", tuaCD=" + tuaCD + "]";
    }
    
}
