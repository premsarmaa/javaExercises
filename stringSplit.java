import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringSplit {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String reg="'+( +|)| +|!+( +|)|,+( +|)|_+( +|)|@+( +|)|\\.+( +|)|\\?+( +|)|\\\\+( +|)";
        String[] nea=s.split(reg);
        scan.close();
        Pattern p=Pattern.compile(reg);
        Matcher m=p.matcher(s);
        int regCount=0;
        while(m.find())
        {
            regCount++;
        }
        System.out.println(regCount);
        for(String i :nea){
            System.out.println(i);
        }
    
      }
}

