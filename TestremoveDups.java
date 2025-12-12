// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class TestremoveDups {
    public static void main(String[] args) {
        int[] a={1,2,3,4,4,5};
        Set<String> removeDup=new HashSet<>(Arrays.asList(Arrays.toString(a)));
        System.out.println(removeDup);
    }
}