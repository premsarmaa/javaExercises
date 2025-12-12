import java.util.Set;
import java.util.TreeSet;
//duplicate values are not allowed
//stores value in order
//binary search tree
//sorts and stores value- we get data stored in ascending order
public class CollectionTreeSet {
    
    public static void main(String[] args){
    Set<Integer> set=new TreeSet<>();
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
