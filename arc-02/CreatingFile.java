import java.io.File;
import java.io.IOException;

public class CreatingFile{
    public static void main(String[] args){
        try{
            File myFile = new File("newFile.txt");
            if(myFile.createNewFile()){
                System.out.println("New has file has been created" + myFile.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}