import java.util.ArrayDeque;
//Deque has methods from Queue interface and also from itself
//We can add/remove from both first and last

public class CollectionArrayDeque {
    public static void main(String[] args){
    ArrayDeque<Integer> deque=new ArrayDeque<>();
    deque.offer(150);//add element to last by default
    deque.offerFirst(60);//add element to first
    deque.offerLast(79);//add element to last
    deque.offerFirst(48);//add element to first
    deque.offer(36);//add element to last by default
    deque.offerFirst(63);//add element to first
    deque.offerLast(34);//add element to last

//view the items on first,last and default and remove them
    System.out.println(deque); 
    System.out.println(deque.peek());//print element to be removed i.e first
    deque.poll();//remove element from first by default(because its a queue)  
     System.out.println(deque);
     System.out.println(deque.peekFirst());
    deque.pollFirst();//remove element from first
     System.out.println(deque.peekLast()); 
    deque.pollLast();
     System.out.println(deque);
   
    
   
}
}
