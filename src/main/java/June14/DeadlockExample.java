public class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Worker1());
        Thread thread2 = new Thread(new Worker2());

        thread1.start();
        thread2.start();
    }

    private static class Worker1 implements Runnable {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Worker1 acquired lock1.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Worker1 acquired lock2.");
                }
            }
        }
    }

    private static class Worker2 implements Runnable {
        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Worker2 acquired lock2.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) {
                    System.out.println("Worker2 acquired lock1.");
                }
            }
        }
    }
}
