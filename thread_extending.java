public class thread_extending extends Thread {
    public void run() {
        System.out.println("thread running");
    }

    public static void main(String[] args) {
        thread_extending t1=new thread_extending();
        t1.start();//start the thread and runs the run() method
    }
}
