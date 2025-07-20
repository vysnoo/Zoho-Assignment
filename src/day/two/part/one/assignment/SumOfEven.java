package day.two.part.one.assignment;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(sumOfEven(input));

    }
    public static int sumOfEven(int n){
        int res=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                continue;
            }
            res=res+i;
        }
        return res;
    }
}
