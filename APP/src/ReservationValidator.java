import java.util.*;

public class ReservationValidator {

    private static final Set<String> validRoomTypes =
            new HashSet<>(Arrays.asList("Single", "Double", "Suite"));

    public void validate(String guestName, String roomType, RoomInventory inventory)
            throws InvalidBookingException {

        // Guest name check
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // Room type validation (CASE SENSITIVE 🔥)
        if (!validRoomTypes.contains(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Availability check
        if (!inventory.isAvailable(roomType)) {
            throw new InvalidBookingException(roomType + " room not available.");
        }
    }
}