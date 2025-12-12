package day12dec;

public class palindrome {
    static void palindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
   public  static void main(String[] args){
        String str="madam";
        palindrome(str);
   }
}
