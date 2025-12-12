import java.io.*;
import java.util.*;

public class ArrayListQsOne {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
       // System.out.println(list);
        int insert=sc.nextInt();
        int insertElement=sc.nextInt();
        list.add(insert, insertElement);
        
        int delete=sc.nextInt();
        //int deleteElement=sc.nextInt();
        list.remove(delete);
        sc.close();
        
        for(int e:list){
            System.err.print(e+" ");
        }
        
        
    }
}