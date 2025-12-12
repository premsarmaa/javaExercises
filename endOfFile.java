import java.util.*;

public class endOfFile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line,text="";
        int i=1;
        
        while(sc.hasNext()!=false){
            line=sc.nextLine();
            if(line.equalsIgnoreCase("exit")) break;
            text=text+i+" "+line+"\n";
            i++;
            
        }
        sc.close();
        System.out.println(text);
    }
}