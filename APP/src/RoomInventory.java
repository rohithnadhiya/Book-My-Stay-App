import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();

        // Initial inventory
        rooms.put("Single", 2);
        rooms.put("Suite", 1);
    }

    public boolean isAvailable(String roomType) {
        return rooms.getOrDefault(roomType, 0) > 0;
    }

    public void decrement(String roomType) {
        rooms.put(roomType, rooms.get(roomType) - 1);
    }
}