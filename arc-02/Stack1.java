
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.add("Apple");

        System.out.println(stack);

        Scanner s = new Scanner(System.in);

        for(int i=0;i<5;i++){
            stack.add(s.next());
        }

        System.out.println(stack);
        
        stack.pop();

        System.out.println(stack.peek());
    }    
}
