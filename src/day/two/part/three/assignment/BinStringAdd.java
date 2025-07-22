package day.two.part.three.assignment;

import java.util.Scanner;

public class BinStringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binVal1=sc.next();
        String binVal2=sc.next();
        int sum=binToDecimal(binVal1)+binToDecimal(binVal2);
        System.out.println(decToBin(sum));
    }

    public static int binToDecimal(String s){
        int sum=0;
        int temp=0;
        for(int i=s.length()-1;i>=0;i--){
            int l = s.charAt(i)-'0';
            sum+=(l*Math.pow(2,temp++));
        }
        return sum;
    }
    public static String decToBin(int n){
        StringBuilder s= new StringBuilder("");
        while(n>0){
            s=s.append(n%2);
            n=n/2;
        }
        s.reverse();
        return s.toString();
    }
}
