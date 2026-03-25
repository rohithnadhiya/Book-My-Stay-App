public class AddOnServiceApp {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection\n");

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "Single-1";

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1000);

        // Attach services
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        // Calculate total
        double total = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + total);
    }
}