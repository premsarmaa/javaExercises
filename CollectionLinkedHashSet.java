
import java.util.LinkedHashSet;
import java.util.Set;
//set stores in serial order - to store in a random order use HashSet
//duplicate values are not allowed
//same as HashSet but stores value one after another like a linked list
public class CollectionLinkedHashSet {
    
    public static void main(String[] args){
    Set<Integer> set=new LinkedHashSet<>();
    set.add(59);
    set.add(45);
    set.add(58);
    set.add(54);

    System.out.println(set);
    set.remove(15);//remove value directly , no index
    System.out.println(set);
    System.out.println(set.contains(58));
    System.out.println(set.isEmpty());
    System.out.println(set.size());
    set.clear();
    System.out.println(set);
}
}
