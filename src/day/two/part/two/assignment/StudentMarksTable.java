package day.two.part.two.assignment;

import java.util.Scanner;

public class StudentMarksTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = 10;

        int[][] marks= new int[numStudents][3];
        int[] rollNo= new int[numStudents];

        for(int i=0;i<numStudents;i++){
            System.out.println("Enter the roll number of student no "+(i+1));
            int sum=0;
            rollNo[i]=sc.nextInt();
            System.out.println("Enter the three subjects marks of the student");
            for (int j=0;j<3;j++){
                marks[i][j]=sc.nextInt();
                sum=sum+marks[i][j];
            }
        }
        System.out.printf("%-10s %-15s %-1s\n","Roll No","Total Marks","Average");
        System.out.println("------------------------------------");

        for(int i=0;i<numStudents;i++){
            int total = marks[i][0]+marks[i][1]+marks[i][2];
            double avg = total/3.0;
            System.out.printf("%-10d %-15d %-10.2f\n",rollNo[i],total,avg);
        }
    }
}
