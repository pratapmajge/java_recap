class demo{
    static void hello(){
        System.out.println("hello");
    }
}

public class method_ref {
    public static void main(String[] args) {
        Runnable r=demo::hello;// model reference used instead of lambda function
        r.run();
    }
}
