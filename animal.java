abstract class animal {
    abstract void demo();
}
class dog extends animal {
    void demo() {
        System.out.println("Dog barking");
    }
    public static void main(String[] args) {
        dog d = new dog();
        d.demo();
    }
}