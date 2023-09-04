import java.util.Stack;
/*
 * When to use stack
 * 1. Web browser history
 * 2. redo and undo features in text editor
 * 3. backtracking algorthms (maze, file directories)
 * 4. calling function (call stack)
 */

public class Main{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty()); returns true
        stack.push("Battle combat");
        stack.push("Motor race");
        stack.push("Skiing race");
        stack.push("parachute race");
        stack.push("duck duck go");
        // System.out.println(stack.empty()); prints false
    }
}