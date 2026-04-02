import java.util.*;

public class BookingQueueApp {

    public static void main(String[] args) {

        Queue<Reservation> queue = new LinkedList<>();

        // Sample bookings
        queue.add(new Reservation("Abhi", "Single"));
        queue.add(new Reservation("Subha", "Single"));
        queue.add(new Reservation("Vamshi", "Suite"));

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService allocationService = new RoomAllocationService();

        System.out.println("Room Allocation Processing\n");

        while (!queue.isEmpty()) {
            Reservation reservation = queue.poll();
            allocationService.allocate(inventory, reservation);
        }
    }
}