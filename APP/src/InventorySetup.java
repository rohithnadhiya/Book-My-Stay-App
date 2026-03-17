/**
 * ================================================================
 * MAIN CLASS – InventorySetup
 * ================================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Demonstrates centralized inventory usage.
 *
 * @version 3.0
 */

public class InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        // Room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Display Single
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Single") + "\n");

        // Display Double
        System.out.println("Double Room:");
        dbl.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Double") + "\n");

        // Display Suite
        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Suite"));
    }
}