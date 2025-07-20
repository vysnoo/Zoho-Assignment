package day.two.part.two.assignment;

import java.util.Scanner;

public class AgeGroupCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        int lessThan18 = 0;
        int between18And60 = 0;
        int greaterThan60 = 0;

        System.out.println("Enter the ages of 10 people:");

        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();

            if (ages[i] < 18) {
                lessThan18++;
            } else if (ages[i] <= 60) {
                between18And60++;
            } else {
                greaterThan60++;
            }
        }

        System.out.println("\nResults:");
        System.out.println("People less than 18: " + lessThan18);
        System.out.println("People between 18 and 60: " + between18And60);
        System.out.println("People greater than 60: " + greaterThan60);
    }
}
