public class ConcurrentBookingProcessor implements Runnable {

    private BookingRequestQueue bookingQueue;
    private RoomInventory inventory;
    private RoomAllocationService allocationService;

    public ConcurrentBookingProcessor(BookingRequestQueue bookingQueue,
                                      RoomInventory inventory,
                                      RoomAllocationService allocationService) {
        this.bookingQueue = bookingQueue;
        this.inventory = inventory;
        this.allocationService = allocationService;
    }

    @Override
    public void run() {

        while (true) {

            Reservation reservation;

            // 🔒 Sync queue
            synchronized (bookingQueue) {

                if (!bookingQueue.hasPendingRequests()) {
                    break;
                }

                reservation = bookingQueue.getNextRequest();
            }

            // 🔒 Sync inventory
            synchronized (inventory) {
                allocationService.allocate(inventory, reservation);
            }
        }
    }
}