package day.one.assignment;
// A set bit means a bit that is 1 in the binary representation of a number.
//What does "first set bit" mean?
//It means the position of the first 1 in the binary
// form of the number, starting from the rightmost bit (also called the Least Significant Bit or LSB).

import java.util.*;

public class FirstSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        while(n>0){
            ls.add(n%2);
            n=n/2;
        }
        System.out.println(ls);
        int pos=1;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)==1){
                break;
            }
            pos++;
        }
        System.out.println(pos);
    }
}
