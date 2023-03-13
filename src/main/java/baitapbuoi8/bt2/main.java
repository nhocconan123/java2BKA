package baitapbuoi8.bt2;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
       StringProcessor demsokitu= new StringProcessor() {
           @Override
           public int process(String s) {
               return s.length();
           }
       };
       String s1="hello world";
        System.out.println(" so ky tu trong s1 : "+demsokitu.process(s1));
        String s2="    welcome   t   java    ";

        StringProcessor demSoTu= new StringProcessor() {
            @Override
            public int process(String s) {
                int count=0;
                if(s.charAt(0)!=' ')
                {
                    for (int i = 0; i < s.length()-1; i++) {
                        if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                        {
                            count++;
                        }
                    }
                }
                return count;
            }
        };
        System.out.println("so tu = " +demsokitu.process(s2));

        // string -> list cac ki tu don -> set
        String s="Hello";


        StringProcessor demSoKyTuSuDung =new StringProcessor() {
            @Override
            public int process(String s) {
                Set<Character> characters=new HashSet<>();
                for (int i = 0; i < s.length(); i++) {
                    characters.add(s.charAt(i));
                }
                return characters.size();
            }
        };
        System.out.println(demSoKyTuSuDung.process("hello world"));
    }
}
