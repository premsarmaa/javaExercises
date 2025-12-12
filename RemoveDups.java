import java.util.*;
public class RemoveDups {
    public static void main(String[] args){
        int[] arr={1,6,7,9,9,3,4,4,6,2,11,15};
        //System.out.println(arr);
        Set<Integer> removeDup=new HashSet<>();
        for(int i:arr){
            removeDup.add(i);
        }
        Set<Integer> unsort=new HashSet<>(Arrays.asList(2,7,4,8,1));
        System.out.println(unsort);
        Set<Integer> newInt=new TreeSet<>();
        newInt.addAll(removeDup);
        Collections.sort(null);
                    System.out.print(removeDup);
            System.out.print(newInt);
    }
    
}
