package buoi8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // tao 1 mang rong
        Map<person, List<Car>> listMap=new HashMap<>();
        //tao 2 nguoi
        person p1 =new person(1,"User 1","Male");
        person p2 =new person(2,"User 2","Female");

        //tao 3 xe
        Car c1=new Car(1,"red","honda");
        Car c2=new Car(1,"red","honda");
        Car c3=new Car(1,"red","honda");

        //p1 so huu xe c1
        listMap.put(p1, Arrays.asList(c1));
        //p2 so huu xe c2
        listMap.put(p2,Arrays.asList(c2));

        System.out.println(listMap);

        //p1 mua them xe c3
        //lay ra danh sach xe. them vao list
        List<Car> p1list=new ArrayList<>(listMap.get(p1));
        p1list.add(c3);
        listMap.put(p1,p1list);
        System.out.println(listMap);



    }
}
