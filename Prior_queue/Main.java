package Prior_queue;
import java.security.AllPermission;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Priority Queue = A FIFO data structure thet serves  elements
        //                  with the highest priorities first before 
        //                  elements with lower priority 
        // prioritized numerous
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(32.0);
        queue.offer(5.0);
        queue.offer(13.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        // prioritized alphabeth
        Queue<String> alphabeth = new PriorityQueue<>(Collections.reverseOrder());
        alphabeth.offer("Z");
        alphabeth.offer("B");
        alphabeth.offer("G");
        alphabeth.offer("S");
        alphabeth.offer("N");
        alphabeth.offer("E");
        alphabeth.offer("L");

         while(!alphabeth.isEmpty()){
            System.out.println(alphabeth.poll());
        }
    }
    
}
