class NumberPrintingRunnable implements Runnable {
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

public class ThreadExampleWithRunnable {
    public static void main(String[] args) {
        NumberPrintingRunnable runnable = new NumberPrintingRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
