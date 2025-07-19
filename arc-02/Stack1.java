
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.add("Apple");

        System.out.println(stack);

        stack.add("Long");

        System.out.println(stack);

        
        stack.add(2, "Hi");

        System.out.println(stack.size());
    }    
}
