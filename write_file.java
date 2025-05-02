import java.io.FileWriter;
import java.io.Writer;

public class write_file {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("example.txt");
            fw.write("Hello");
            fw.close();

            System.out.println("Wrote in file");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
