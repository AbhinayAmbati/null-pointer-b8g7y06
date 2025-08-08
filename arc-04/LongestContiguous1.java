import java.util.*;

public class LongestContiguous1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        int max = 0, count=0; 

        for(int i=0;i < n;i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i=0;i < n;i++)
        {
            if(arr[i] == 1){
                count++;
            }
            if(max < count){
                max = count;
            }
            if(arr[i] == 0){
                count=0;
            }
        }
        System.out.println(max);
    }
    
}
