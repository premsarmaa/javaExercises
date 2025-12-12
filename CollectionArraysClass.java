import java.util.Arrays;

public class CollectionArraysClass {
    public static void main(String args[]){
        int[] a1={1,2,3,4,5,6,7,8};
        int index=Arrays.binarySearch(a1,4);
        System.out.println("Index of element 4 in the array is :"+index);
        Arrays.toString(a1);
        Integer[] a2={21,43,5,34,76,89};
        Arrays.sort(a2);
        Arrays.fill(a2,12);// fill the array with 12
        for(int i:a2){
            System.out.print(i+" ");
        }
        
    }
}
