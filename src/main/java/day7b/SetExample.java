package day7b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set<String> stringSet= new HashSet<>();
        while(true){
            System.out.println("Enter your string: ");
            String tmp=sc.nextLine();
            if(tmp.equalsIgnoreCase("exit"))
                break;
            stringSet.add(tmp);
            System.out.println(stringSet);
        }
    }


}
