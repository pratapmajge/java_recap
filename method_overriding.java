public class method_overriding {
    String name;

    void method1(String name){
        name ="ABC";
        System.out.println("old name "+name);
    }
}
class child extends method_overriding{
    void method1(String name){
        super.method1(name);
        // super used to access immediate parent class of subclass or to access parent methos in methodoverriding
        this.name=name;
        System.out.println(name);
    }
    public static void main(String[] args) {
        child c = new child();
        c.method1("pratap");
    }
}
