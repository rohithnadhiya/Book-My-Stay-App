public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery\n");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        // 🔁 Load previous state
        persistenceService.loadInventory(inventory, filePath);

        // Show current inventory
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: " + inventory.getAvailableCount("Single"));
        System.out.println("Double: " + inventory.getAvailableCount("Double"));
        System.out.println("Suite: " + inventory.getAvailableCount("Suite"));

        // Simulate some booking changes
        inventory.decrement("Single");
        inventory.decrement("Double");

        // 💾 Save state before shutdown
        persistenceService.saveInventory(inventory, filePath);
    }
}