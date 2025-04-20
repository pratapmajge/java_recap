abstract class abstract_2 {
    abstract void animal();
    
    void demo(){
        System.out.println("Demo");
    }
}
class dogesh extends abstract_2{
    void animal(){
        System.out.println("Dogesh bhai");
    }
    public static void main(String[] args){
        dogesh d=new dogesh();
        d.animal();
        d.demo(); // to print demo
    }
}
