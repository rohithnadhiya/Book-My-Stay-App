public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("Booking History and Reporting\n");

        // Create history
        BookingHistory history = new BookingHistory();

        // Create sample reservations (already confirmed)
        Reservation r1 = new Reservation("Abhi", "Single");
        r1.setConfirmed(true);

        Reservation r2 = new Reservation("Subha", "Double");
        r2.setConfirmed(true);

        Reservation r3 = new Reservation("Vamshi", "Suite");
        r3.setConfirmed(true);

        // Add to history
        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        // Generate report
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history);
    }
}