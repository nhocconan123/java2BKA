package baitap2;

public class Tinh {
    public <T extends HinhHoc> void draw(T t)
    {
        String tmp = String.format("Vẽ hình %s, có the tích là %.2f", t.getClass().getSimpleName(), t.tinhTheTich());
        System.out.println(tmp);
    }
}
