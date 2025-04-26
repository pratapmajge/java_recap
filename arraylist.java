import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // arraylist is not thread-safe
        ArrayList<String> list_name=new ArrayList<>();
        list_name.add("name");
        list_name.add("address");
        list_name.add("home");
        System.out.println(list_name);
    }
}
