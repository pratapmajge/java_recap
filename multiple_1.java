interface multiple {
    int a=10;
    default void display(){
        System.out.println("The base class");
    }
}
public interface multiple_1 {
    int b=20;
    default void display_1(){
        System.out.println("interface 2");
    }
}
class child implements multiple , multiple_1{
    void add(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        child c=new child();
        c.add();
        c.display();
        c.display_1();
    }
}

