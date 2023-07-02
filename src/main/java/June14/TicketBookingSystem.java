public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketBookingService bookingService = new TicketBookingService();

        Thread thread1 = new Thread(new BookingThread(bookingService, "User1"));
        Thread thread2 = new Thread(new BookingThread(bookingService, "User2"));

        thread1.start();
        thread2.start();
    }

    private static class BookingThread implements Runnable {
        private final TicketBookingService bookingService;
        private final String username;

        public BookingThread(TicketBookingService bookingService, String username) {
            this.bookingService = bookingService;
            this.username = username;
        }

        @Override
        public void run() {
            bookingService.bookTicket(username);
        }
    }

    private static class TicketBookingService {
        private final Object lock = new Object();

        public void bookTicket(String username) {
            synchronized (lock) {
                System.out.println(username + " is booking a ticket...");
                try {
                    // Simulating ticket booking process
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(username + " has booked a ticket.");
            }
        }
    }
}
