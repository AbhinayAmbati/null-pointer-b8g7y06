import java.util.*;

public class OddEvenIndex {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%2==0){
                arrList.add(a[i]);
            }
        }

        for(int i=0;i<n;i++){
            if(i%2!=0){
                arrList.add(a[i]);
            }
        }

        System.out.println(arrList);

    }
    
}
