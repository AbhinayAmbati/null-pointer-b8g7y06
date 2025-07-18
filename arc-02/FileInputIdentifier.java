import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class FileIdentifier{
    public void letsIdentify(String s){
         String[] keyWords = {"int", "boolean", "char", "byte", "short", "long", "float", "double"};
        String[] punctuations = {"{", ";", "}", "[", "]", "'", "."};
        String[] specialChar = {"=", "+", "-", "*", "&", "%", "/", "<", ">", "!"};
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};

        Set<String> keySet = new HashSet<>(Arrays.asList(keyWords));
        Set<String> punctSet = new HashSet<>(Arrays.asList(punctuations));
        Set<String> specSet = new HashSet<>(Arrays.asList(specialChar));
        Set<String> numSet = new HashSet<>(Arrays.asList(numbers));

        

        String[] tokens = s.split("\s+");

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

public class FileInputIdentifier {
    public static void main(String[] args) throws FileNotFoundException{

        File myFile = new File("FileInput.txt");

        Scanner s = new Scanner(myFile);

        String str = null ;

        while(s.hasNextLine()){
            str = s.nextLine();
        }

        FileIdentifier i = new FileIdentifier();

        i.letsIdentify(str);

    }
}
