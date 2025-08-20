/*
Jack Olson
COP 3330C
1-17-24

This program will print out some details about BJ's Brewhouse and Millers Ale House when ran.
Inputs provided for Bjs brewhouse are the location, seating capacity, and if that location has a brewery in it.
While Millers Ale House inputs are the name, specialty drink and happy hour start time.
When the code is tested the output should accurately display Millenia as the location, 150 seating capacity, and no
brewery for Bjs Brewhouse and for Millers Ale house it will display the restaurant name, specialty drink and
happy hour start time.
 */

// Making the class for BJ's Restaurant
class BJsRestaurant {
    // Creating fields
    private String location;
    private int seatingCapacity;
    private boolean hasBrewery;

    // Constructor with restaurant parameters
    public BJsRestaurant(String location, int seatingCapacity, boolean hasBrewery) {
        this.location = location;
        this.seatingCapacity = seatingCapacity;
        this.hasBrewery = hasBrewery;
    }

    // Overloaded constructor
    public BJsRestaurant() {
        this.location = null;
        this.seatingCapacity = 0;
        this.hasBrewery = false;
    }

    // Making the getters and setters for BJ's
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isHasBrewery() {
        return hasBrewery;
    }

    public void setHasBrewery(boolean hasBrewery) {
        this.hasBrewery = hasBrewery;
    }

    // Custom method
    public String recommendDish() {
        return "BJ's signature dish: Deep Dish Pizza!";
    }

    // Printing the restaurant details for BJ's
    public void printDetails() {
        System.out.println("BJ's Restaurant Details:");
        System.out.println("Location: " + location);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Has Brewery: " + (hasBrewery ? "Yes" : "No"));
    }
}

// Making the class for Ale House
class AleHouse {
    // Creating fields
    private String name;
    private String specialtyDrink;
    private int happyHourStartTime;

    // Constructor with parameters
    public AleHouse(String name, String specialtyDrink, int happyHourStartTime) {
        this.name = name;
        this.specialtyDrink = specialtyDrink;
        this.happyHourStartTime = happyHourStartTime;
    }

    // Overloaded constructor
    public AleHouse() {
        this.name = null;
        this.specialtyDrink = null;
        this.happyHourStartTime = 0;
    }

    // Making the getters and setters for Ale House
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialtyDrink() {
        return specialtyDrink;
    }

    public void setSpecialtyDrink(String specialtyDrink) {
        this.specialtyDrink = specialtyDrink;
    }

    public int getHappyHourStartTime() {
        return happyHourStartTime;
    }

    public void setHappyHourStartTime(int happyHourStartTime) {
        this.happyHourStartTime = happyHourStartTime;
    }

    // Custom method
    public String happyHourInfo() {
        return "Happy hour starts at: " + happyHourStartTime + " PM. Don't miss the great deals!";
    }

    // Print method for Ale House
    public void printDetails() {
        System.out.println("Millers Ale House Details:");
        System.out.println("Name: " + name);
        System.out.println("Specialty Drink: " + specialtyDrink);
        System.out.println("Happy Hour Start Time: " + happyHourStartTime + " PM");
    }
}



