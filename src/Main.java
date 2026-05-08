public class Main {
    public static void main(String[] args) {
        // --- WAREHOUSE SETUP (DO NOT MODIFY) ---
        Item[] warehouse = new Item[3];
        
        warehouse[0] = new Item();
        warehouse[0].name = "Laptop";
        warehouse[0].price = 1000.0;
        warehouse[0].quantity = 5;

        warehouse[1] = new Item();
        warehouse[1].name = "Mouse";
        warehouse[1].price = 25.0;
        warehouse[1].quantity = 50;

        warehouse[2] = new Item();
        warehouse[2].name = "Keyboard";
        warehouse[2].price = 75.0;
        warehouse[2].quantity = 20;

        String searchTarget = "Mouse";

        // --- EXECUTING YOUR METHODS ---
        double totalValue = calculateTotalValue(warehouse);
        int itemIndex = findItem(warehouse, searchTarget);

        System.out.println("Total Warehouse Value: $" + totalValue);
        System.out.println("Item found at index: " + itemIndex);
    }

    // --- YOUR MISSION ---

    // TODO: Create the calculateTotalValue method
    // Parameter: Item[] inv
    // Return Type: double
    // Logic: Loop through the array. For every item, multiply its price by its quantity, 
    // and add it to a running total. Return the total.


    // TODO: Create the findItem method
    // Parameters: Item[] inv, String targetName
    // Return Type: int
    // Logic: Use a linear search. If the item's name equals the targetName, return its index.
    // If it is not found, return -1.
}
