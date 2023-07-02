class NumberPrintingThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds between each number
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        NumberPrintingThread thread = new NumberPrintingThread();
        thread.start();
    }
}
