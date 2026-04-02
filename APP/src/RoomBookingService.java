import java.util.Map;

public class RoomBookingService {

    public void bookRoom(RoomInventory inventory, String roomType) {

        // Check availability
        if (!inventory.isAvailable(roomType)) {
            System.out.println(roomType + " room is not available!");
            return;
        }

        // Reduce inventory
        inventory.decrement(roomType);

        // Confirm booking
        System.out.println(roomType + " room booked successfully!");
    }
}