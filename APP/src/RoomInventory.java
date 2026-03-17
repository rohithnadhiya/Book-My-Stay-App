/**
 * ================================================================
 * CLASS – RoomInventory
 * ================================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class acts as the single source of truth
 * for room availability in the hotel.
 *
 * @version 3.0
 */

import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    /**
     * Stores available room count for each room type.
     * Key   -> Room type name
     * Value -> Available count
     */
    private Map<String, Integer> roomAvailability;

    /**
     * Constructor initializes the inventory
     * with default values.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes room availability.
     */
    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    /**
     * Returns full availability map.
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Updates availability for a room type.
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}