package day.one.assignment;

import java.util.Scanner;

public class isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.println("The number is not Power of Two");
        }else{
            while(n%2==0){
                n=n/2;
            }
        }
        if(n==1){
            System.out.println("The number is Power of Two");
        }else{
            System.out.println("The number is not Power of Two");
        }
    }
}
