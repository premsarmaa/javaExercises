package day12dec;

import java.util.Arrays;
import java.util.Scanner;

public class reversePart3 {
    
    static void reverse(String str){
    
    int length=str.length();
    String rev="";
    //char[] ch=new char[length];
    for(int i=length-1;i>=0;i--){
        rev=rev.concat(""+str.charAt(i));
    }
System.out.println(rev);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    reverse(str);

}
}
