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

    // Existing method
    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }

    // ✅ ADD THIS METHOD (OUTSIDE main)
    public void displayDetails(int available) {
        System.out.println(this.getClass().getSimpleName() + " Room:");
        displayRoomDetails();
        System.out.println("Available: " + available);
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("Hotel Room Test\n");

        Room single = new Room(1, 250, 1500.0);
        Room dbl = new Room(2, 400, 2500.0);
        Room suite = new Room(3, 750, 5000.0);

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

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