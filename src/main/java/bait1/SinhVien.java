package bait1;

public class SinhVien {
    private String maSinhVien;
    private String hTen;
    private String nSinh;
    private String queQuan;


    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hTen, String nSinh, String queQuan) {
        this.maSinhVien = maSinhVien;
        this.hTen = hTen;
        this.nSinh = nSinh;
        this.queQuan = queQuan;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String gethTen() {
        return hTen;
    }

    public void sethTen(String hTen) {
        this.hTen = hTen;
    }

    public String getnSinh() {
        return nSinh;
    }

    public void setnSinh(String nSinh) {
        this.nSinh = nSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hTen='" + hTen + '\'' +
                ", nSinh='" + nSinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
