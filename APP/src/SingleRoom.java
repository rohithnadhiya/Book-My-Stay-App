/**
 * ================================================================
 * CLASS – SingleRoom
 * ================================================================
 *
 * Represents a single room type.
 *
 * @version 2.1
 */
public class SingleRoom extends Room {

    // Constructor
    public SingleRoom() {
        super(1, 250, 1500.0);
    }

    // Optional: main method to test only SingleRoom
    public static void main(String[] args) {

        System.out.println("Single Room Test\n");

        SingleRoom room = new SingleRoom();
        room.displayRoomDetails();

        int available = 5;
        System.out.println("Available: " + available);
    }
}