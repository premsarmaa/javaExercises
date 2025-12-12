
import java.util.Map;
//Stores in key value pair
//duplicate keys are not allowed
//duplicate values are allowed
//TreeMap sorts keys and stores the data
import java.util.TreeMap;

public class CollectionTreeMap {
    
    public static void main(String[] args){
    Map<String,Integer> numbers=new TreeMap<>();
    numbers.put("prem",  21);
    numbers.put("nars",  77);
    numbers.put("shap",  180);
    numbers.put("prem",  54);//it will overwrite previous value
    System.out.println(numbers);//this will print entire map
    //to avoid value overwriting use below to check if value present in key
        if(!numbers.containsKey("nars"))
        {
            numbers.put("nars",  91);
        }
//to not use 'if' use below
        numbers.putIfAbsent("nars", 66);

        //iterate through the map

      for(Map.Entry<String,Integer> e:numbers.entrySet())
        {
            System.out.println(e); //this will print map entry set (key and value)
            System.out.println(e.getKey());//this will return and print only keys
            System.out.println(e.getValue());//this will return and print only values
        }  
//iterate only key set

for(String e:numbers.keySet()){
    System.out.println(e);
}
  //contains key or not
  System.out.println(numbers.containsKey("prem"));
  //contains value or not
  System.out.println(numbers.containsValue(54));

  //check if HashMap is empty
    System.out.println(numbers.isEmpty());
//remove from hashmap
    numbers.remove("prem");
     System.out.println(numbers);
    //clear all contents
    numbers.clear();
    System.out.println(numbers);//this will print entire map
}
}
