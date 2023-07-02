public class ArraySumMultiThreaded {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        SumThread[] threads = new SumThread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new SumThread(array, i * (ARRAY_SIZE / THREAD_COUNT), (i + 1) * (ARRAY_SIZE / THREAD_COUNT));
            threads[i].start();
        }

        int totalSum = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                threads[i].join();
                totalSum += threads[i].getPartialSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of array elements: " + totalSum);
    }

    private static class SumThread extends Thread {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;
        private int partialSum;

        public SumThread(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public int getPartialSum() {
            return partialSum;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
        }
    }
}
