package baitapbuoi8.bt1;

import buoi8.Car;
import buoi8.person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void submenu()
    {
        System.out.println("___ Quan Ly Danh Ba ___");
        System.out.println("1. Them danh ba");
        System.out.println("2. Cap nhat danh ba");
        System.out.println("3. Xoa danh ba theo so dien thoai");
        System.out.println("4. Xem toan bo danh ba");
        System.out.println("thoat");
    }
    static Map<String, String> listContact = new HashMap<>();
    public static void main(String[] args) {

        listContact.put("huy","12345");
        Scanner sc= new Scanner(System.in);
        int option=-1;
        do
        {
            submenu();
            System.out.println("nhap lua chon");
            try {

                option = Integer.parseInt(sc.nextLine());
            }
            catch (Exception e)
            {
                System.out.println("nhap sai dinh dang");
                continue;
            }if(option<1|| option>5)
        {
            System.out.println("k hop le");
        }
            switch (option)
            {
                case 1:
                    listContact.put("huy","0396013");
                    break;
                case 2:
                    System.out.println("chap nhat danh ba");
                    boolean flag=false;

                    break;
                case 3:
                    System.out.println("xoa danh ba theo so dien thoai");
                    break;
                case 4:
                    //In ra danh ba-> duyet map
                    for (String phone : listContact.keySet()) {
                        System.out.printf("\t%s - %s \n", listContact.get(phone), phone);
                    }
                    break;
            }
        } while (option!=5);

    }
}
