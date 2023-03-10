package day7b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();
        Car car1=new Car(1,"Honda");
        Car car2=new Car(2,"Honda");
        carSet.add(car1);
        carSet.add(car2);
        Car car3=car1;

        System.out.println(car3.hashCode());
        System.out.println(car1.hashCode());

        System.out.println(carSet);

        // gia su co 1 set cac phan tu -> nhu cau duyet theo chi so

        // chuyen sang list
        List<Car> listCar=new ArrayList<>();
        listCar.addAll(carSet);

    }
}
