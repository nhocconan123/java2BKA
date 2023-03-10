package baitap2;

public class HinhLapPhuong implements HinhHoc{
    private double canh=1.0;

    public HinhLapPhuong() {
    }

    public HinhLapPhuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhTheTich() {
        return Math.pow(canh,3);
    }

    // dinh nghia them 1 phuong thuc cho phep nhap du lieu tu ban phim
}
