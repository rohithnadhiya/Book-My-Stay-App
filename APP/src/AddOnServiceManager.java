import java.util.*;

public class AddOnServiceManager {

    private Map<String, List<AddOnService>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, AddOnService service) {

        servicesByReservation
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);

        System.out.println(service.getServiceName() + " added for " + reservationId);
    }

    public void displayServices(String reservationId) {

        List<AddOnService> services = servicesByReservation.get(reservationId);

        if (services == null || services.isEmpty()) {
            System.out.println("No add-ons selected.");
            return;
        }

        System.out.println("Services for Reservation " + reservationId + ":");

        for (AddOnService s : services) {
            System.out.println("- " + s.getServiceName() + " : ₹" + s.getCost());
        }
    }

    public double calculateTotalServiceCost(String reservationId) {

        List<AddOnService> services = servicesByReservation.get(reservationId);

        double total = 0;

        if (services != null) {
            for (AddOnService s : services) {
                total += s.getCost();
            }
        }

        return total;
    }
}