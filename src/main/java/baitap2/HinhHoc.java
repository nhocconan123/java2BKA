package baitap2;

public interface  HinhHoc extends Comparable<HinhHoc> {
     double tinhTheTich();
     @Override
     default int compareTo(HinhHoc o)
     {
          if(this.tinhTheTich()<o.tinhTheTich())
          {  return 1;}
          else if(this.tinhTheTich()<o.tinhTheTich())
          {
               return -1;
          }
          return 0;
     }
}
