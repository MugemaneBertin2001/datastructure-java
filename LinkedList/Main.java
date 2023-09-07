package LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;

/************************************************************
 *  LinkedList = stores Nodes in 2 parts (data + address),
 * Nodes are in non-consecutive memory  location
 * elements are linked using pointers          
 *          Singly Linked List
 *     Node                     Node                Node
 *      [Data | address] -> [Data | address]-> [Data | address]
 * 
 *          Doubly linked List
 *      Node                                  Node
 *  [address | data | address] <->  [address | data | address]
 * 
 * Advantages:
 *  1. Dynamic Data Structure (allocation needed memory while running)
 *  2. Insertion and deletion of Nodes is easy. 0(1)
 *  3. No/Low memory waste 
 * 
 * Disadvantages:
 *  1. Greater memory usage (additional pointer)
 *  2. No random access of elements (no index [i])
 *  3. Access/Searching elements is more time consuming. 0(n) 
 * Uses:
 *  Implement Stacks/Queues
 * GPS navigation
 * Music playlist
 * 
 */

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");
        linkedList.push("G");
        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.offer("A");
        linkedList1.offer("B");
        linkedList1.offer("C");
        linkedList1.offer("D");
        linkedList1.offer("E");
        linkedList1.offer("F");
        linkedList1.offer("G");
        System.out.println(linkedList1);
    }
    
}
