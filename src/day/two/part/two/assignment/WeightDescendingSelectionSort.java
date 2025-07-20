package day.two.part.two.assignment;

import java.util.Scanner;

public class WeightDescendingSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights = new double[10];
        System.out.println("Enter weights of 10 people:");
        for (int i = 0; i < weights.length; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }
        for(int i=0;i<weights.length;i++){
            int maxIndex=i;
            for(int j=i+1;j<weights.length;j++){
                if(weights[maxIndex]<weights[j]){
                    maxIndex=j;
                }
            }
            double temp= weights[maxIndex];
            weights[maxIndex]=weights[i];
            weights[i]=temp;
        }

        System.out.println("\nWeights in Descending Order:");
        for (double weight : weights) {
            System.out.println(weight);
        }

    }
}
