public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation\n");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancelService = new CancellationService();

        // Simulate confirmed booking
        String reservationId = "Single-1";
        String roomType = "Single";

        cancelService.registerBooking(reservationId, roomType);

        // Cancel booking
        cancelService.cancelBooking(reservationId, inventory);

        // Show rollback history
        cancelService.showRollbackHistory();

        // Show updated inventory
        System.out.println("\nUpdated " + roomType + " Room Availability: "
                + inventory.getAvailableCount(roomType));
    }
}