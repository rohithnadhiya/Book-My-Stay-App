import java.util.Map;
public class RoomSearchService {

    public void searchAvailableRooms(RoomInventory inventory,
                                     Room singleRoom,
                                     Room doubleRoom,
                                     Room suiteRoom) {

        System.out.println("Room Search\n");

        if (inventory.isAvailable("Single")) {
            singleRoom.displayDetails(1);
        }

        if (inventory.isAvailable("Double")) {
            doubleRoom.displayDetails(1);
        }

        if (inventory.isAvailable("Suite")) {
            suiteRoom.displayDetails(1);
        }
    }
}