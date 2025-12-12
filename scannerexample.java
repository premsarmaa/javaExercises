import java.util.Scanner;

public class scannerexample {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String b=s.next();//to just add one word
        s.nextLine();//to add all lines which comes after space
        s.close();
//print
        System.out.println(a);
        System.out.println(b);
    }
}
