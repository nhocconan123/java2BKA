package bait1;

import buoi7.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void menumain()
    {
        System.out.println("1. danh sach sinh vien");
        System.out.println("2. nhap thong tin sinh vien");
        System.out.println("3. tim kiem sinh vien");
        System.out.println("4. danh sach mon hoc");
        System.out.println("5. nhap thong tin mon hoc");
        System.out.println("6. nhap diem mon hoc");
        System.out.println("7. cap nhap diem mon hoc");
        System.out.println("8. xem diem sv theo ma");
        System.out.println("9. In danh sach sinh vien theo mon hoc");
        System.out.println("10. In danh sach sinh vien tcod diem trung binh tat ca ca mon học");
        System.out.println("0. thoat");
    }
    public static void main(String[] args) {
        List<SinhVien> sinhVienList = new ArrayList<>();
        sinhVienList.add(new SinhVien("BKC1","Nguyen Van A", "2000-01-01","HN"));
        List<MonHoc> monHocList = new ArrayList<>();
        monHocList.add(new MonHoc("Java1","Lập trình Java cơ bản"));
        List<Diem> diemList = new ArrayList<>();
        diemList.add(new Diem("BKC1","Java1",10));

        // Chuong trinh chinh
        Scanner in = new Scanner(System.in);
        int option = -1;
        do {
            menumain();
            System.out.print("Nhập lựa chọn: ");
            // Nhập dữ liệu
            try {
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng");
                continue;
            }
            // Kiểm tra xem người dùng nhập lựa chọn nào?
            if (option < 1 || option > 10) {
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }
            switch (option) {
                case 1:
                    // In ra danh sach sinh vien
                    if (sinhVienList.size() == 0) {
                        System.out.println("Danh sách sinh viên trống!");
                        continue;
                    }
                    System.out.printf("Danh sách %d sinh viên: \n", sinhVienList.size());
                    for (SinhVien s : sinhVienList) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    SinhVien s = new SinhVien();
                    System.out.print("\tNhập mã sinh viên: ");
                    s.setMaSinhVien(in.nextLine());
                    System.out.print("\tNhập tên sinh viên: ");
                    s.sethTen(in.nextLine());
                    System.out.print("\tNhập ngày sinh: ");
                    s.setnSinh(in.nextLine());
                    System.out.print("\tNhập quê quán: ");
                    s.setQueQuan(in.nextLine());

                    // Them ban sinh vien vua tao vao danh sach
                    sinhVienList.add(s);

                    break;
                case 3:
                    // Y tuong -> duyet arrayList, xem co khop id nhap vao hay ko?
                    System.out.print("\tNhập mã sinh viên cần tìm: ");
                    String maSV = in.nextLine();

                    // Đặt cờ đánh dấu, false là ko có
                    boolean flag = false;

                    for (SinhVien student: sinhVienList) {
                        if(student.getMaSinhVien().equals(maSV)){
                            flag = true;
                            System.out.println(student);
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.println("Không tìm thấy sinh viên đó!");
                    }

                    break;
                case 4:
                    MonHoc mh=new MonHoc();
                    for (MonHoc mon: monHocList) {
                        System.out.println("mon hoc"+mon);
                    }

                    break;
                case 5:
                    MonHoc monHoc = new MonHoc();
                    System.out.print("\tNhập mã môn hoc: ");
                    monHoc.setMaMonHoc(in.nextLine());
                    System.out.print("\t Nhap ten mon hoc");
                    monHoc.setTenMonHoc(in.nextLine());

                    // Them mon hoc vua tao vao danh sach
                    monHocList.add(monHoc);
                    break;
                case 6:
                    // Nhap ma sinh vien -> kiem tra xem co hop le hay ko
                    System.out.print("Nhập mã sinh viên: ");
                    String mSv = in.nextLine();
                    boolean flag1 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getMaSinhVien().equals(mSv)){
                            flag1 = true;
                            break;
                        }
                    }
                    if(flag1 == false) {
                        System.out.println("Không có sinh viên đó!");
                        continue;
                    }
                    // Nhap ma mon hoc -> kiem tra xem ma mon co hop le hay ko
                    System.out.print("Nhập mã môn học: ");
                    String mMh = in.nextLine();
                    boolean flag2 = false;
                    for (MonHoc monHoc1: monHocList) {
                        if(monHoc1.getMaMonHoc().equals(mMh)){
                            flag2 = true;
                            break;
                        }
                    }
                    if(flag2 == false) {
                        System.out.println("Không có môn học đó!");
                        continue;
                    }
                    // Nhap diem
                    System.out.print("Nhập điểm: ");
                    int diem = Integer.parseInt(in.nextLine());
                    Diem d = new Diem(mSv, mMh, diem);

                    // Them diem vao listDiem
                    diemList.add(d);

                    break;
                case 7:
                    System.out.print("Nhập mã sinh viên: ");
                    String mSV = in.nextLine();
                    boolean flag3 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getMaSinhVien().equals(mSV)){
                            flag3 = true;
                            break;
                        }
                    }
                    if(flag3 == false) {
                        System.out.println("Không có sinh viên đó!");
                        continue;
                    }
                    System.out.print("Nhập mã môn học: ");
                    String mMH = in.nextLine();
                    boolean flag4 = false;
                    for (MonHoc monHoc1: monHocList) {
                        if(monHoc1.getMaMonHoc().equals(mMH)){
                            flag2 = true;
                            break;
                        }
                    }
                    if(flag4 == false) {
                        System.out.println("Không có môn học đó!");
                        continue;
                    }
                    // Nhap diem
                    System.out.print("Nhập điểm: ");

                    for (Diem diem1 : diemList) {
                        System.out.println(diem1);
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:

                    break;
            }

        }
        while (option != 0);
        in.close();
    }



}
