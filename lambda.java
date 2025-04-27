@FunctionalInterface // this is optional 
interface lambda_ex {// this is functional interface which need to use lambda function,
    // this contain only one method inside interface
    void demo();
}
// public class lambda{
//     public static void main(String[] args) {
//         lambda_ex l=new lambda_ex(){
//         public void demo(){
//             System.out.println("hii");
//         }
//     };
//         l.demo();
//     }
// }

//using lambda
public class lambda{
    public static void main(String[] args) {
        lambda_ex l=() -> System.out.println("hii");
        l.demo();
    }
}