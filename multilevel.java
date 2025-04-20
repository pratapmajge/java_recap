public class multilevel {
    int num_1=10 , num_2=20;

    void addition(){
        System.out.println(num_1+num_2);
    }
}
class child1 extends multilevel{
    void sub(){
        System.out.println(num_1-num_2);
    }
}
class child2 extends child1{
    void mul(){
        System.out.println(num_1*num_2);
    }
    public static void main(String[] args) {
        child2 c=new child2();
        c.addition();
        c.sub();
        c.mul();
    }
}
