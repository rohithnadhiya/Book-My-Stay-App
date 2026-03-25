import java.util.Map;

public class RoomBookingService {

    public void bookRoom(RoomInventory inventory, String roomType) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (!availability.containsKey(roomType)) {
            System.out.println("Invalid room type!");
            return;
        }

        int count = availability.get(roomType);

        if (count > 0) {
            availability.put(roomType, count - 1);
            System.out.println(roomType + " room booked successfully!");
        } else {
            System.out.println(roomType + " room is not available!");
        }
    }
}