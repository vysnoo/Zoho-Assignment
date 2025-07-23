package day.two.part.three.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class findTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] sa = s.toCharArray();
        char[] ta =t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        for(int i=0;i<sa.length;i++){
            if(sa[i]!=ta[i]){
                System.out.println(ta[i]);
                return;
            }
        }
        System.out.println(ta[ta.length-1]);
    }
}
