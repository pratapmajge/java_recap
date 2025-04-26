class dis_num extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

class dis_let extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println("Number " + ch);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

public class thread_ex {
    public static void main(String[] args) {
        dis_num d1 = new dis_num();
        dis_let d2 = new dis_let();
        d1.start();
        d2.start();
    }
}
