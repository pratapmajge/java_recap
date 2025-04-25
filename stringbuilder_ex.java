public class stringbuilder_ex {
    //used when performance is important  and accessed by only one thread
    public static void main(String[] args) {
        String str ="hi";
        StringBuilder sb=new StringBuilder("hello ");
        sb.append("to all");
        System.out.println(sb);
    }
}
