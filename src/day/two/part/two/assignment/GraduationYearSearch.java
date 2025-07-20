package day.two.part.two.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class GraduationYearSearch {
    public static void main(String[] args) {
        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        Arrays.sort(years);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of graduation: ");
        int inputYear = sc.nextInt();
        int start=0;
        int end=years.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(years[mid]==inputYear){
                System.out.println("Record Exists");
                return;
            } else if (years[mid]<inputYear) {
                start=mid+1;
            } else {
                end=mid-1;
            }

        }

        System.out.println("Record Doesn't exists");

    }
}
