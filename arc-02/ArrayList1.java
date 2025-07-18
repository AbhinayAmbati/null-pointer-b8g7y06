
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        for(int i=0;i<5;i++){
            arrayList.add(s.nextInt());
        }

        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);

        for(int i=0;i<arrayList.size()-1;i++){
            System.out.print(arrayList.get(i)+ " ");
        }

        arrayList.add(2, 54);
        arrayList.remove(2);

        System.out.println(arrayList.get(2));

        ArrayList<Integer> b = (ArrayList<Integer>) arrayList.clone();

        System.out.println(b);


    }
}
    

