/**
 * ================================================================
 * CLASS – SuiteRoom
 * ================================================================
 *
 * Represents a suite room type.
 *
 * @version 2.1
 */
public class SuiteRoom extends Room {

    // Constructor
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }

    // Optional: main method to test only SuiteRoom
    public static void main(String[] args) {

        System.out.println("Suite Room Test\n");

        SuiteRoom room = new SuiteRoom();
        room.displayRoomDetails();

        int available = 2;
        System.out.println("Available: " + available);
    }
}