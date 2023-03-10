package baitap2;

public class main {
    public static void main(String[] args) {
        HinhCau hc=new HinhCau(3);
        HinhCau hc1=new HinhCau(3);
        HinhLapPhuong hinhLapPhuong= new HinhLapPhuong(5);

        Tinh tinh =new Tinh();
        tinh.draw(hc);
        tinh.draw(hc1);
        tinh.draw(hinhLapPhuong);




    }
}
