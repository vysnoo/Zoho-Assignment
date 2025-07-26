package day.two.part.one.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input no of rows");
        int inp = sc.nextInt();
        Pattern4a pc = new Pattern4a();
        List<List<Integer>> result =pc.generate(inp);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                System.out.print(" ");
            }

            for (int num : result.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0){
            return result;
        }
        List<Integer> firstRow= new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows==1){
            return result;
        }

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
