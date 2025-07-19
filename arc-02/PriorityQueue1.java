
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1
{

    public static void main(String[] args){

        PriorityQueue<String> pqueue1 = new PriorityQueue<>();

        pqueue1.add("Apple");
        pqueue1.add("Mango");
        pqueue1.add("Green");
        pqueue1.add("Orange");

        if(pqueue1.contains("Apple")){
            System.out.println("yes");
        }

        pqueue1.remove("Apple");

        if(pqueue1.contains("Apple")){
            System.out.println("yes");
        }

        System.out.println(pqueue1);

        System.out.println(pqueue1.peek());

        System.out.println(pqueue1.remove());

        System.out.println(pqueue1);

        Iterator value = pqueue1.iterator();

        while(value.hasNext()){
            System.out.println(value.next());
        }

    }
    
}
