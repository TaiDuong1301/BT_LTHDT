package bai13;

import java.text.NumberFormat;
import java.util.Locale;

public class CongNhan implements Comparable<CongNhan> {
    private String maCN;
    private String mHo, mTen;
    private int mSoSP;
    //Constructor
    public CongNhan() {
    }
    
    public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP >= 0 ? mSoSP : 0;
    }
    //Getter
    public String getMaCN() {
        return maCN;
    }
    public String getmHo() {
        return mHo;
    }
    public String getmTen() {
        return mTen;
    }
    public int getmSoSP() {
        return mSoSP;
    }
    //Setter
    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }
    public void setmHo(String mHo) {
        this.mHo = mHo;
    }
    public void setmTen(String mTen) {
        this.mTen = mTen;
    }
    public void setmSoSP(int mSoSP) throws Exception {
        if (mSoSP >= 0) {
            this.mSoSP = mSoSP;
        }
        else {
            throw new Exception("So sap pham am");
        }
    }
    public double tinhLuong() {
        if (mSoSP < 200)
            return mSoSP*0.5;
        else if (mSoSP < 400)
            return 100 + (mSoSP - 200)*0.55;
        else if (mSoSP < 600)
            return 100 + 110 + (mSoSP - 400)*0.6;
        return 100 + 110 + 120 + (mSoSP - 600)*0.65;
    }
    @Override
    public String toString() {
        Locale lc = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
        return String.format("|%10s|%10s|%10s|%10d|%10s", maCN, mHo, mTen, mSoSP, nf.format(tinhLuong()));
    }

    @Override
    public int compareTo(CongNhan o) {
        // TODO Auto-generated method stub
        if (mSoSP > o.mSoSP)
            return 1;
        else if (mSoSP == o.mSoSP)
            return 0;
        return 0;
    }

    // @Override
    // public int compareTo(CongNhan o) {
    //     if (mSoSP > o.mSoSP)
    //         return 1;
    //     else if (mSoSP == o.mSoSP)
    //         return 0;
    //     return 0;
    // }

}
