public class synchronization {
    int balance = 3000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrowing " + amount);
            balance=balance-amount;
            System.out.println("Remaining balance "+ balance);
        }
        else{
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        synchronization s=new synchronization();

        Thread t1=new Thread(() -> s.withdraw(1000));
        Thread t2=new Thread(() -> s.withdraw(500));

        t1.start();
        t2.start();
    }
}

