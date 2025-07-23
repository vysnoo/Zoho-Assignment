package day.two.part.three.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class VowelReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        int p1 =0;
        int p2=s.length()-1;
        Boolean startVowel=false;
        Boolean endVowel = false;
        char[] c = s.toCharArray();
        // hello
        while(p1<p2){
            if(s.charAt(p1)=='a' || s.charAt(p1)=='e' || s.charAt(p1)=='i' || s.charAt(p1)=='o'|| s.charAt(p1)=='o'){
                startVowel=true;
                if(s.charAt(p2)=='a' || s.charAt(p2)=='e' || s.charAt(p2)=='i' || s.charAt(p2)=='o'|| s.charAt(p2)=='o'){
                    endVowel=true;
                    char temp=c[p1];
                    c[p1]=c[p2];
                    c[p2]=temp;
                    startVowel=false;
                    p1++;
                    p2--;
                    endVowel=false;
                }else if(endVowel==false){
                    p2--;
                }
            }else if(startVowel==false) {
                p1++;
            }
        }
        System.out.println(String.valueOf(c));
    }
}
