public class stringDuplicate {
    public static void main(String[] args){

        String name="Prem sorma";
        char na='m';
        //char[] na=name.toCharArray();
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==na)count++;
            }
            
        System.out.println(count);
    }
}

