package day.eight.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceEx {

        public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(54);
        nums.add(93);
        nums.add(32);
        nums.add(11);
        Collections.sort(nums);
        System.out.println(nums);

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(nums,comp);
        System.out.println(nums);
    }
}
