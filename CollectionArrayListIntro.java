//https://www.youtube.com/watch?v=rzA7UJ-hQn4&t=2345s
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayListIntro {
  public static void main(String[] args) {
        List<String> intro=new ArrayList<>();//declare
        intro.add("hello");//add
        intro.add("bro");
       System.out.println(intro.get(0)); //get
        System.out.println(intro.get(1)); 
        intro.add(2,"yo");

        List<String> newList=new ArrayList<>();
        newList.add("12");
        intro.addAll( newList);//add other list to original list
        System.out.println(intro);

        //iterate through list

         for(int i=0;i<intro.size();i++){
          System.out.println("Elements no "+i+" is "+intro.get(i));
         }

         //iterate using for each

         for(String element:intro){
          System.out.println("For each element is "+ element);
        }

        //can also use Iterator

        Iterator<String> iterator=intro.iterator();
        while(iterator.hasNext()){
          System.out.println("iterator value :"+iterator.next());
        }

        intro.remove(1); System.out.println(intro); //remove
        intro.remove(String.valueOf("yo"));
         System.out.println(intro);
         
         //iterate through list

         for(int i=0;i<intro.size();i++){
          System.out.println("Elements no "+i+" is "+intro.get(i));
         }

         System.out.println(intro.contains("hello"));//contains- returns boolean
         intro.clear();//clear list
          System.out.println(intro); 
     }
}
