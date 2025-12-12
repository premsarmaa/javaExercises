import java.util.Stack;

public class CollectionStackIntro {
    
    public static void main(String[] args){
    Stack<String> animals=new Stack<>();
    animals.push("goaty");
    animals.push("pussy");
    animals.push("piggy");
    animals.push("lizzy");

    System.out.println(animals);
    System.out.println(animals.peek()); //returns top element

    animals.pop(); //removes top element
    System.out.println(animals);
    
}
}
