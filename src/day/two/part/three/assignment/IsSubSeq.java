package day.two.part.three.assignment;

import java.util.Scanner;

public class IsSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int p1=0;
        int p2=0;
        while(p1<s.length() && p2<t.length()){
            if(s.charAt(p1)==t.charAt(p2)){
                p1++;
                p2++;
            }else {
                p2++;
            }
        }
        if(p1==s.length()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
