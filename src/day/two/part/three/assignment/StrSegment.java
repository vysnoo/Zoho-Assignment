package day.two.part.three.assignment;

import java.util.Scanner;

public class StrSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
       String[] sa= s.trim().split("\\s+");
        int res= s.trim().isEmpty()?0:sa.length;
        System.out.println(res);
    }
}
