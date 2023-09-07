package ArrayList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.insert(0, "v");
        // dynamicArray.delete("A");
        System.out.println(dynamicArray.search("D"));
        System.out.println("Empty: "+dynamicArray.isEmpty());
        System.out.println("Size: "+dynamicArray.size);
        System.out.println("Capacity: "+dynamicArray.capacity);
        System.out.println(dynamicArray);
    }
    
}
