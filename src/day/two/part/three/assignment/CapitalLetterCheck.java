package day.two.part.three.assignment;

import java.util.Scanner;

public class CapitalLetterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(detectCapitalUse(s));
    }
    public static boolean detectCapitalUse(String word) {
        int capCount=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capCount++;
            }
        }
        if(capCount==word.length()){
            return true;
        }
        capCount=0;
        if(Character.isUpperCase(word.charAt(0))){
            capCount++;
        }
        for(int i=1;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capCount++;
            }
        }
        if(Character.isUpperCase(word.charAt(0)) && capCount==1){
            return true;
        }
        capCount=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                capCount++;
            }
        }
        if(capCount==0){
            return true;
        }
        return false;
    }
}
