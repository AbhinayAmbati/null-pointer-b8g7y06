import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {

    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(1);

        Scanner s = new Scanner(System.in);

        for(int i=0;i<5;i++){
            queue.add(s.nextInt());
        }

        System.out.println(queue.peek());

        System.out.println(queue);

    }
    
}
