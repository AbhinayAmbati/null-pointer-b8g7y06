
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("Apple");
            linkedList.addAll(0, linkedList);

            System.out.println(linkedList);

            Scanner s = new Scanner(System.in);

            for(int i=0;i<5;i++){
                linkedList.add(s.next());
            }

            System.out.println(linkedList);

            
        }
}
