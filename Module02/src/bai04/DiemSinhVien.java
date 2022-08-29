package bai04;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public DiemSinhVien() {
		this(0, "", 0, 0);
	}
	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.maSV = maSV < 0 ? 0 : maSV;
		this.hoTen = hoTen.equals("") ? "xxx" : hoTen;
		this.diemLT = (diemLT < 0 || diemLT > 10) ? 0 : diemLT;
		this.diemTH = (diemTH < 0 || diemTH > 10) ? 0 : diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV < 0 ? 0 : maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen.equals("") ? "xxx" : hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = (diemLT < 0 || diemLT > 10) ? 0 : diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = (diemTH < 0 || diemTH > 10) ? 0 : diemTH;
	}
	/**
	 * Tinh diem trung binh
	 * @return
	 */
	public float diemTrungBinh() {
		return (diemLT + diemTH)/2;
	}
	@Override
	public String toString() {
		return String.format("%6d %-20s %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, diemTrungBinh());
	}
	
}
