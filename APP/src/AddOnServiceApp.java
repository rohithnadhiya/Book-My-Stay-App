public class AddOnServiceApp {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection\n");

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "Single-1";

        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1000);
        AddOnService wifi = new AddOnService("WiFi", 200);

        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);
        manager.addService(reservationId, wifi);

        System.out.println();

        manager.displayServices(reservationId);

        double total = manager.calculateTotalServiceCost(reservationId);

        System.out.println("\nReservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: ₹" + total);
    }
}