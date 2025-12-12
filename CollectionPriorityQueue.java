import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
//PriorityQueue creates minheap and maxheap
//It can implement the Queue interface , so it will have same methods as done in LinkedListQueue example

public class CollectionPriorityQueue {
    public static void main(String[] args){
    Queue<Integer> queueMin=new PriorityQueue<>();
    queueMin.offer(150);//add element
    queueMin.offer(113);
    queueMin.offer(233);
    queueMin.offer(87);

    System.out.println(queueMin); //it will print min heap and keep minimum valaued element at first

    queueMin.poll();//remove element
    
    System.out.println(queueMin);

    System.out.println(queueMin.peek()); // shows which will be popped or polled

    Queue<Integer> queueMax=new PriorityQueue<>(Comparator.reverseOrder()); //Comparator passed with reverseOrder for max heap
 
    queueMax.offer(67);
    queueMax.offer(56);
    queueMax.offer(78);
    queueMax.offer(57);
    
    System.out.println(queueMax); //it will print max heap
    queueMax.poll();  //removes largest value
    System.out.println(queueMax);  
}
}
