package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
// *******************************************
// Queue = FIFO data structure. First_In First_Out (ex: line of people)
//          A collection designed for holding element prior  to processing
//          LInear data structure
//      add = enqueue, offer
//      remove = dequeue, poll
// *******************************************

// *******************************************
// When is queue used ?
//  1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
//  2. Printer Queue (Printer jobs should be  completed in order)
//  3. Used in LinkedLists, PriorityQueues, Breadth-first search
// *******************************************

public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();
    // inserting data into the queue
    
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Herold");
        // applied functions
        System.out.println(queue.size()); // size of objects in queue       
    }
    
}
