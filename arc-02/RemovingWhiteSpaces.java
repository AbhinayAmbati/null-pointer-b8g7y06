import java.util.*;

class Remover{
    public void whiteSpaceRemover(String s){
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for(int i=0;i< size;i++ ){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
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