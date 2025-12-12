import java.util.*;

class series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int cal=a;
            for(int j=0;j<n;j++){
                cal=(int) (cal+ ((Math.pow(2, n)*b)));
                System.out.print(cal+" ");
            }
        }
        in.close();
    }
}