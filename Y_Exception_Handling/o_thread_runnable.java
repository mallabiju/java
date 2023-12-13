package Y_Exception_Handling;

class meroThread implements Runnable {
    public void run() {
        System.out.println("Mero thread is running");
    }
}

public class o_thread_runnable {
    public static void main(String[] args) {
        meroThread mt = new meroThread();
        Thread t = new Thread(mt);

        t.start();
    }
}
