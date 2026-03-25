public class RoomSearch {

    public static void main(String[] args) {

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        RoomSearchService searchService = new RoomSearchService();
        RoomBookingService bookingService = new RoomBookingService();

        // 🔍 Step 1: Show available rooms
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );

        // 💥 Step 2: Book a room
        bookingService.bookRoom(inventory, "Single");

        System.out.println("\nAfter Booking:\n");

        // 🔁 Step 3: Show updated rooms
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}