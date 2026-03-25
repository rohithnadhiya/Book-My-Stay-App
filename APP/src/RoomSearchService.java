import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        System.out.println("Room Search\n");

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get("Single") > 0) {
            singleRoom.displayDetails(availability.get("Single"));
        }

        if (availability.get("Double") > 0) {
            doubleRoom.displayDetails(availability.get("Double"));
        }

        if (availability.get("Suite") > 0) {
            suiteRoom.displayDetails(availability.get("Suite"));
        }
    }
}