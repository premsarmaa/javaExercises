import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiplicationtable {
    public static void main(String[] args) throws NumberFormatException, IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bufferedReader.readLine().trim());//or use scanner to get int value

        bufferedReader.close();

        for(int i=1;i<=10;i++){
            System.out.println(N +" x "+i+" = "+(N*i));
        }

        
        System.out.println(N);
    }
}
