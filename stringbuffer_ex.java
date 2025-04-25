public class stringbuffer_ex {
    //used when thread security is more important and when to run more threads(synchronized methods)
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("hello");
        sbf.append(" to all");
        System.out.println(sbf);
    }
}
