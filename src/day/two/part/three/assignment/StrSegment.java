package day.two.part.three.assignment;

import java.util.Scanner;

public class StrSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
