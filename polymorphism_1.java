class polymorphism_1{
    // int a=10;
    // int b=20;

    void add(int a,int b){
        System.out.println(a+b);
    }
}
class child extends polymorphism_1{
    void add(float c,float d){
        System.out.println(c-d);
    }
    public static void main(String[] args) {
        child c=new child();
        c.add(10, 20);
        c.add(2.4f, 3.4f);
    }
}