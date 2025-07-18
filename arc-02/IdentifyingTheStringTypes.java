import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Identifier{
    public void letsIdentify(String s){
         String[] keyWords = {"int", "boolean", "char", "byte", "short", "long", "float", "double"};
        String[] punctuations = {"{", ";", "}", "[", "]", "'", "."};
        String[] specialChar = {"=", "+", "-", "*", "&", "%", "/", "<", ">", "!"};
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};

        Set<String> keySet = new HashSet<>(Arrays.asList(keyWords));
        Set<String> punctSet = new HashSet<>(Arrays.asList(punctuations));
        Set<String> specSet = new HashSet<>(Arrays.asList(specialChar));
        Set<String> numSet = new HashSet<>(Arrays.asList(numbers));

        

        String[] tokens = s.split("\\s+");

        for(String token : tokens){
            if(keySet.contains(token)){
                System.out.println(token + " - is a keyword");
            }
            else if(punctSet.contains(token)){
                System.out.println(token + " - is a punctuation");
            }
            else if(specSet.contains(token)){
                System.out.println(token + " - is a special character");
            }
            else if(numSet.contains(token)){
                System.out.println(token + " - is a number");
            }
            else if(token.matches("[a-zA-Z_][a-zA-Z0-9_]*")){
                System.out.println(token+" - is a identifier");
            }
            else{
                System.out.println(token + " - is number");
            }
        }

    }
}

public class IdentifyingTheStringTypes {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        Identifier i = new Identifier();

        i.letsIdentify(str);

    }
}
