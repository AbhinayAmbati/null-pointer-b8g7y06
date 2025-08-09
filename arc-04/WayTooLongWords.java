
import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        while (n-- > 0) { 
            String str = s.nextLine();

            int len = str.length();
            if(len <= 10){
                System.out.println(str);
            }else{
                System.out.println(""+ str.charAt(0)+ (len - 2) + str.charAt(len-1));
            }
        }

    }
    
}
