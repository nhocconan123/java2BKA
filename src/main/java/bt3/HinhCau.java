package bt3;

public class HinhCau implements HinhHoc3D {
    private double banKinh = 1.0;

    public HinhCau() {
    }

    public HinhCau(double banKinh) {
        if (banKinh <= 0) {
            throw new IllegalArgumentException("Ban kinh phai duong");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new IllegalArgumentException("Ban kinh phai duong");
        }
        this.banKinh = banKinh;
    }
    @Override
    public double tinhTheTich() {
        return 0;
    }

    @Override
    public int compareTo(HinhHoc3D o) {
        return HinhHoc3D.super.compareTo(o);
    }
}
