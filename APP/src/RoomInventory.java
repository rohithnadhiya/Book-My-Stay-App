import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();

        // Initial inventory
        rooms.put("Single", 2);
        rooms.put("Double", 2);
        rooms.put("Suite", 1);
    }

    // ✅ Check availability
    public boolean isAvailable(String roomType) {
        return rooms.getOrDefault(roomType, 0) > 0;
    }

    // ✅ Decrease count (booking)
    public void decrement(String roomType) {

        if (!rooms.containsKey(roomType)) {
            System.out.println("Invalid room type.");
            return;
        }

        int count = rooms.get(roomType);

        if (count <= 0) {
            System.out.println(roomType + " rooms not available.");
            return;
        }

        rooms.put(roomType, count - 1);
    }

    // ✅ Increase count (cancellation rollback)
    public void increment(String roomType) {
        rooms.put(roomType, rooms.getOrDefault(roomType, 0) + 1);
    }

    // ✅ Get exact count (for display/reporting)
    public int getAvailableCount(String roomType) {
        return rooms.getOrDefault(roomType, 0);
    }

    // ✅ Display all inventory (optional debug)
    public void displayInventory() {

        System.out.println("Current Room Inventory:");

        for (Map.Entry<String, Integer> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}