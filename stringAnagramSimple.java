import java.util.Arrays;

public class stringAnagramSimple{
    public static void main (String[] args){
        String a="ssf";
        String b="fSs";
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        String a1=new String(c);
        String b1=new String(d);
        System.out.println(a1);
        System.out.println(b1);
        if(a1.equals(b1)){System.out.println("Anagram");}
        else System.out.println("Not Anagram");

    }

}