package day.two.part.three.assignment;

import java.util.Scanner;

public class ExcelNoToDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp=sc.nextInt();
        String res="";
        while(inp>0){
            inp--;
            res=res+(char)(inp%26+'A');
            inp=inp/26;
        }
        System.out.println(res);
    }
}
