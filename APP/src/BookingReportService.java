import java.util.*;

public class BookingReportService {

    public void generateReport(BookingHistory history) {

        System.out.println("Booking History Report\n");

        List<Reservation> list = history.getConfirmedReservations();

        if (list.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Reservation r : list) {
            System.out.println("Guest: " + r.getGuestName()
                    + ", Room Type: " + r.getRoomType());
        }
    }
}