import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int z = a;

        int arm = 0;

        int n = count(a);

        while(a > 0){
            int r = a%10;
            arm = arm + (int) Math.pow(r, n);
            a = a/10;
        }      
        
        if(arm == z)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }

    public static int count(int n){
        int c = 0;

        while(n > 0){
            n = n/10;
            c++;
        }

        return c;
    }
    
}
