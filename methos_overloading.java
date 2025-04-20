public class methos_overloading {
    public int age;
    public String name;
    void method1(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println(age+ " " + name);
    }
    void method1(int age){
        this.age = age;
        System.out.println("updated age " + age);

    }
    public static void main(String[] args) {
        methos_overloading m = new methos_overloading();
        m.method1(19, "Pratap");
        m.method1(21);
    }
}
