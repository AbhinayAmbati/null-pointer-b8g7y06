import java.util.*;

public class SplitString{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String[] s1 = str.split("[,\\s\\.]+");


        for(String a : s1){
            System.out.println(a);
        }
    }
}