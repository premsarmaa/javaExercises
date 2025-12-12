import java.util.HashSet;
import java.util.Set;
//set stores in random order - to store in a order use LinkedHashSet
//duplicate values are not allowed

public class CollectionHashSet {
    
    public static void main(String[] args){
    Set<Integer> set=new HashSet<>();
    set.add(59);
    set.add(45);
    set.add(58);
    set.add(54);

    System.out.println(set);

    set.remove(45);//remove value directly , no index
    System.out.println(set);
    System.out.println(set.contains(58));
    System.out.println(set.isEmpty());
    System.out.println(set.size());
    set.clear();
    System.out.println(set);
}
}
