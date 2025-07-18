import java.util.*;

class Remover{
    public void whiteSpaceRemover(String s){
        int size = s.length();
        for(int i=0;i< size;i++ ){
            if(s.charAt(i) != ' '){
                System.out.print(s.charAt(i));
            }
        }
    }
}

public class RemovingWhiteSpaces{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Remover r = new Remover();

        r.whiteSpaceRemover(str);
    }
}