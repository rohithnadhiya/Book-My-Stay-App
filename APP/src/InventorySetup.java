public class InventorySetup {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        SingleRoom single = new SingleRoom();
        DoubleRoom dbl = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        // Display Single
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " +
                (inventory.isAvailable("Single") ? "Yes" : "No"));

        // Display Double
        System.out.println("\nDouble Room:");
        dbl.displayRoomDetails();
        System.out.println("Available Rooms: " +
                (inventory.isAvailable("Double") ? "Yes" : "No"));

        // Display Suite
        System.out.println("\nSuite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " +
                (inventory.isAvailable("Suite") ? "Yes" : "No"));
    }
}