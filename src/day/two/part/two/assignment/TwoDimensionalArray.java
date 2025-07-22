package day.two.part.two.assignment;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row size");
        int m = sc.nextInt();
        System.out.println("Enter the colum size");
        int n=sc.nextInt();
        int[][] A=new int[m][n];
        getInput(A,m,n,sc);
        print2DArray(A,m,n);
        System.out.println("Sum of All Elements - "+sumOfElements(A,m,n));
        rowSum(A,m,n);
        colSum(A,m,n);
        Transpose(A,m,n);


    }
    public static void getInput(int[][] A, int m, int n, Scanner sc){
        System.out.println("Enter "+m*n+ " values");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]= sc.nextInt();
            }
        }
    }

    public static void print2DArray(int[][] A,int m, int n){
        System.out.println("Printing the Array");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sumOfElements(int[][] A,int m, int n){
        int sum=0;
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum=sum+A[i][j];
            }
        }
        return sum;
    }
    public static void rowSum(int[][] A,int m, int n){
        for (int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+A[i][j];
            }
            System.out.println("row "+(i+1)+" sum is "+sum);
        }
    }

    public static void colSum(int[][] A,int m, int n){
        for (int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum=sum+A[j][i];
            }
            System.out.println("col "+(i+1)+" sum is "+sum);
        }
    }
    public static void Transpose(int[][] A,int m, int n){
        System.out.println("Transpose of the matrix");
        int[][] tp = new int[n][m];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                tp[j][i]=A[i][j];
            }
        }
        for(int i=0;i<tp.length;i++){
            for(int j=0;j<tp[0].length;j++){
                System.out.print(tp[i][j]+" ");
            }
            System.out.println();
        }
    }


}
