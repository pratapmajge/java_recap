public class thread_sleep implements Runnable{
    public void run(){
       System.out.println("Thread running");
    }
    public static void main(String[] args) {
        thread_sleep t1=new thread_sleep();
        Thread t=new Thread(t1);
        try {
            t.sleep(2000);
            t.start();
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
