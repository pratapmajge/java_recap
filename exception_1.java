public class exception_1 {
    static int a=20;
    // static used to access int a inside main method
    public static void main(String[] args) {
        try {
            int b=20;
            System.out.println(a/0);
        } catch (Exception e) {
            System.out.println("Can't divide by zero");
        }
        //this executes whatever happens in try & catch
        finally{
            System.out.println("Division done");
        }
    }
}
