package buoi7;

import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        // them mot string
        stringCollection.add("hello");
        stringCollection.add("hi");
        //In ra collection
        System.out.println(stringCollection);
        //thay doi gia tri 1 phan tu theo index
        // ar[index]=>khong co,dung list

        stringCollection.remove("hello");
        System.out.println(stringCollection);
        //stringCollection.size();
        System.out.println(stringCollection.size());


    }
}
