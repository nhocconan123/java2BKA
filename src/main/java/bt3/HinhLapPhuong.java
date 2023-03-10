package bt3;

public class HinhLapPhuong implements HinhHoc3D{
    private double canh = 1.0;

    public HinhLapPhuong() {
    }

    public HinhLapPhuong(double canh) {
        if (canh <= 0) {
            throw new IllegalArgumentException("Canh phai duong");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new IllegalArgumentException("Canh phai duong");
        }
        this.canh = canh;
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
