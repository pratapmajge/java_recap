import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        try {
           File file = new File("example.txt"); 

           if (file.createNewFile()) {
            System.out.println("File created :"+file.getName());
           }
           else{
            System.out.println("file already exists..!");
           }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("error ");
            e.printStackTrace();
        }
    

       
    }
    
}
