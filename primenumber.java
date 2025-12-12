import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        sc.close();
       int count=0;
       if(p<=1){System.out.println("not prime- 0 ,1");}
       else{
        for(int i=2;i<p;i++)
        {
            if(p%i==0)
            count++;
        }
    if(count>1)
        {System.out.println("not prime number");} 
    else{System.out.println("Prime number");}
       }

}
}
