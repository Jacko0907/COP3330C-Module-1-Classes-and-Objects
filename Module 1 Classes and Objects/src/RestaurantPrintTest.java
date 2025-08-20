// Main class to test
public class RestaurantPrintTest {
    public static void main(String[] args) {
        // BJ's Restaurant instance
        BJsRestaurant bjs = new BJsRestaurant("Millennia", 150, false);
        bjs.printDetails();
        System.out.println(bjs.recommendDish());

        // Ale House instance
        AleHouse aleHouse = new AleHouse("Winter Park", "Craft Beer", 3);
        aleHouse.printDetails();
        System.out.println(aleHouse.happyHourInfo());
    }
}
