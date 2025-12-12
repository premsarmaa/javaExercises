import java.util.Arrays;

public class arraySubarray {
     public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,7};
        int[] sub=Arrays.copyOfRange(arr, 3,5);
        System.out.println(""+Arrays.toString(sub));
     }
}
