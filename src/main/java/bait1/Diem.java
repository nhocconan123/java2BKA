package bait1;

public class Diem {
    private String maSinhVien;
    private String maMonHoc;
    private int diem;

    public Diem() {
    }

    public Diem(String maSinhVien, String maMonHoc, int diem) {
        this.maSinhVien = maSinhVien;
        this.maMonHoc = maMonHoc;
        this.diem = diem;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Diem{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", maMonHoc='" + maMonHoc + '\'' +
                ", diem=" + diem +
                '}';
    }
}
