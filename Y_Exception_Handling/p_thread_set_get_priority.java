package Y_Exception_Handling;

// how to get priority in java thread

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class p_thread_set_get_priority {
    public static void main(String[] args) {
        ThreadDemo tp = new ThreadDemo();
        /*
         * Thread t = new Thread(tp,"Hello");
         * System.out.println("Thread Priority = " + t.getPriority());
         * System.out.println("Thread Name = " + t.getName());
         */

        Thread t1 = new Thread(tp, "Helo Ram");
        Thread t2 = new Thread(tp, "Helo Sita");
        Thread t3 = new Thread(tp, "Helo Laxman");

        t1.setPriority(3);
        t3.setPriority(4);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
