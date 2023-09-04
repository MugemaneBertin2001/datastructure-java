package Prior_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure thet serves  elements
        //                  with the highest priorities first before 
        //                  elements with lower priority 

        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(32.0);
        queue.offer(5.0);
        queue.offer(13.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    
}
