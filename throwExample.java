import java.util.Scanner;

// this is to create ou own exception  
class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
    }
}
public class throwExample {
    // is you create own custom exception you have to use either throws or try catch in main method
    public static void main(String[] args) throws AgeException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you age : ");
        int age=sc.nextInt();
        // int a=17;
        if (age <18) {
            throw new AgeException("Age is less than 18");
        }
        System.out.println("You are an adult");
    } 
}
