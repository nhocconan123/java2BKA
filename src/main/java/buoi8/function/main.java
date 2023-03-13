package buoi8.function;

public class main {
    public static void main(String[] args) {
        MyFunctional sum= new MyFunctional() {
            @Override
            public double calulator(double a, double b) {
                return a+b;
            }
        };
        System.out.println("tong 3 va 5 = "+sum.calulator(3.0,5.0));

        //dinh nghia 1 phuong thuc tinh bieu thuc
        //A= 5*a+3*b-10
        MyFunctional experssion=new MyFunctional() {
            @Override
            public double calulator(double a, double b) {
                return a*5+b*3-10;
            }
        };
        System.out.println(experssion.calulator(1,2));

        // thuong dinh nghia trong truong hop can dung den
        //thuong ket phop voi stream API và lambda expression

    }
}
