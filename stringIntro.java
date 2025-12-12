import java.util.Scanner;

public class stringIntro{

public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    String A=sc.nextLine();
    String B=sc.nextLine();
    sc.close();

    int length1=A.length();
    int length2=B.length();
    int totalLength=length1+length2;
    System.out.println(totalLength);

    //write Yes if  is lexicographically greater than  otherwise print No instead\
    if(A.compareTo(B)>0){
        System.out.println("Yes");
    }
    else if(B.compareTo(A)>0){
        System.out.println("No");
    }
    else if(A.compareTo(B)==0){
        System.out.println("No");
    }

    String A1=(""+A.charAt(0)).toUpperCase();
    String B1=(""+B.charAt(0)).toUpperCase();

    
        System.out.println(A1+A.substring(1)+" "+B1+B.substring(1));
   
         System.out.println(A.length()+B.length());        
    if(A.compareTo(B)>0){
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
  //  System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
}

}