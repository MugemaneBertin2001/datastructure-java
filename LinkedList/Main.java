package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

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
