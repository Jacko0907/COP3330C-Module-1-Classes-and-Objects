public class RestaurantApp {
    public static void main(String[] args) {
        // Create an instance of BJ's Restaurant
        BJsRestaurant bjs = new BJsRestaurant("Millennia", 150, false);
        // Print the original attributes
        System.out.println("Initial Details for BJ's Restaurant:");
        bjs.printDetails();

        // Modify an attribute of BJ's Restaurant (Location)
        bjs.setLocation("I-Drive");
        bjs.setSeatingCapacity(200);
        System.out.println("\nUpdated Details for BJ's Restaurant:");
        bjs.printDetails();

        // Create an instance of Ale House
        AleHouse aleHouse = new AleHouse("Millers Ale House", "Craft Beer", 5);
        // Print the original attributes
        System.out.println("\nInitial Details for Ale House:");
        aleHouse.printDetails();

        // Modify an attribute of Ale House (Specialty Drink)
        aleHouse.setSpecialtyDrink("Basil Hayden Smoked Cinnamon Old Fashioned");
        System.out.println("\nUpdated Details for Ale House:");
        aleHouse.printDetails();
    }
}

