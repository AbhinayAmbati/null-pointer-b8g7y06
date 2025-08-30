import java.util.Scanner;

public class CountSetBits{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while(n > 0){
            if((n&1)==1){
                count++;
            }
            System.out.println(n);
            n>>=1; // right shifting n for 1 time until > 0
        }
        System.out.println(count);
    }
}