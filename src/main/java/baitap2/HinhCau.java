package baitap2;

import bait1.Main;

public class HinhCau implements  HinhHoc{
    private double bankinh=1.0;
    public HinhCau(double bankinh) {
        this.bankinh = bankinh;
    }
    public double getBankinh() {
        return bankinh;
    }
    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    @Override
    public double tinhTheTich() {
        return Math.PI*Math.pow(bankinh,3)*4/3;
    }
    @Override
    public String toString() {
        return "HinhCau{" +
                "bankinh=" + bankinh +
                '}';
    }
}
