import java.util.LinkedList;
import java.util.Queue;

public class CollectionLinkedListQueue {
    
    public static void main(String[] args){
    Queue<Integer> queue=new LinkedList<>();
    queue.offer(100);//add element
    queue.offer(200);
    queue.offer(233);

    System.out.println(queue);

    queue.poll();//remove element
    
    System.out.println(queue);

    System.out.println(queue.peek()); // shows which will be popped or polled

    
    
}
}
