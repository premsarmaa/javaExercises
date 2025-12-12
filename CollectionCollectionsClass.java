import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionCollectionsClass {
    public static void main(String args[]){
        List<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(60);
        numbers.add(60);
        numbers.add(90);
        numbers.add(70);
        
Collections.sort(numbers);//sorts in asc order
System.out.println(numbers);

Collections.sort(numbers,Comparator.reverseOrder());//sorts in desc order
System.out.println(numbers);

System.out.println(Collections.min(numbers));
System.out.println(Collections.max(numbers));
int frequency=Collections.frequency(numbers,60);
System.out.println("Frequency of 60 is "+frequency);
    }
}
