package day12dec;

public class reverse {
    static void dupes(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str="hello";
        dupes(str);
    }
}
