/**
 * ================================================================
 * CLASS – DoubleRoom
 * ================================================================
 *
 * Represents a double room type.
 *
 * @version 2.1
 */
public class DoubleRoom extends Room {

    // Constructor
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }

    // Optional: main method to test only DoubleRoom
    public static void main(String[] args) {

        System.out.println("Double Room Test\n");

        DoubleRoom room = new DoubleRoom();
        room.displayRoomDetails();

        int available = 3;
        System.out.println("Available: " + available);
    }
}