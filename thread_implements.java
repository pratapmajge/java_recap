public class thread_implements implements Runnable {
    public void run(){
        System.out.println("Implemnets runnable thread is running");
    }
    // implements runnable is most used because here we can extend another classes and more lightweight
    public static void main(String[] args) {
        thread_implements t1=new thread_implements();
        Thread th=new Thread(t1);//creating thread object
        th.start();
    }
}
