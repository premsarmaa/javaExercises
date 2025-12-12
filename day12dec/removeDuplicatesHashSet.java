package day12dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicatesHashSet {
    static void reverse(String[] str){
       Set<String> enter=new HashSet<>(Arrays.asList(str));
        System.out.println(enter);
    
    }
    public static void main(String[] args) {
        String[] s={"s","f","ds","s","f"};
        reverse(s);

        int[] i={1,2,3,4,4,5,5,6,1,2};
        Set<Integer> number=new HashSet<>();
        for(int n:i){
            number.add(n);
        }
        System.out.println(number);

    }
}
