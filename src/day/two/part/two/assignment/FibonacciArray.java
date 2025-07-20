package day.two.part.two.assignment;

public class FibonacciArray {
    public static void main(String[] args) {
        int[] fb = new int[30];
        fb[0]=0;
        fb[1]=1;
        for(int i=2;i<30;i++){
            fb[i]=fb[i-2]+fb[i-1];
        }
        for (int i : fb){
            System.out.println(i);
        }
    }
}
