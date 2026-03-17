/**
 * ================================================================
 * CLASS – Room (Runnable Version)
 * ================================================================
 *
 * This version includes a main() method so it can run independently.
 *
 * @version 2.1
 */
public class Room {

    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    // Constructor
    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    // Display method
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }

    // MAIN METHOD (so it can run)
    public static void main(String[] args) {

        System.out.println("Hotel Room Test\n");

        // Create sample rooms
        Room single = new Room(1, 250, 1500.0);
        Room dbl = new Room(2, 400, 2500.0);
        Room suite = new Room(3, 750, 5000.0);

        // Availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        System.out.println("Double Room:");
        dbl.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}