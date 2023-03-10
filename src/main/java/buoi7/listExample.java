package buoi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listExample {
    public static void main(String[] args) {
        //tao 1 arrayList luu tru thong tin cua cac ban sinh vien
        //chua biet so luong cu the, co the them nhieu?
        List<Student> arrayList = new ArrayList<>();

        //them 1 ban sinh vien
        Student s1= new Student(10,"huy");
        arrayList.add(s1);
        // them student 2
        Student s2=new Student(2,"duong");
        arrayList.add(s2);
        // in danh sach sinh vien
        System.out.printf("co %d ban sinh vien trong danh sach\n", arrayList.size());
        System.out.println(arrayList);
        Student s=arrayList.get(1);
        s.setName("sinh vien 2");
        System.out.println(arrayList);

        // thay the phan tu tai vi tri index=1
        Student s3=new Student(3,"student 3");
        arrayList.set(1,s3);
        System.out.println("student sau khi duoc thay the");
        System.out.println(arrayList);
        //xoa phan tu trònaraylist theo chi so
//        arrayList.remove(0);
//        System.out.println(arrayList);
        // xoa phan tu theo object
//        System.out.println("ket qua sau khi xoa");
//        arrayList.remove(s3);
        //sap xep cac phan tu
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
