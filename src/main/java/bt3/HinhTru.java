package bt3;

public class HinhTru implements HinhHoc3D{
    private double bankinh=1.0;
    private double height=1.0;

    public HinhTru() {
    }

    public HinhTru(double bankinh, double height) throws IllegalAccessException {
        if(bankinh<=0||height<=0)
        {
            throw new IllegalAccessException("khich thuoc phai duong");
        }
        this.bankinh = bankinh;
        this.height = height;
    }

    @Override
    public double tinhTheTich() {
        return Math.PI*bankinh*bankinh*height;
    }

    @Override
    public int compareTo(HinhHoc3D o) {
        return HinhHoc3D.super.compareTo(o);
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "bankinh=" + bankinh +
                ", height=" + height +
                '}';
    }
}
