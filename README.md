Jack Olson CEN-3024C-13950



# COP3330C-Module-1-Classes-and-Objects

This project was created to show the use of classes and objects in Java.
Each class will demonstrate the use of Encapsulation, Constructors, and Utility methods.

The AleHouse class allows you to create objects by providing values for the name(String), specialityDrink(String), and happyHourStartTime(int).
It also uses getters and setters to access and modify the different fields.

The second Class called BjsRestaurant which has different properties than the AleHouse class. 
The 3 properties for BjsRestaurant are location(String), seatingCapacity(int), and hasBrewery(boolean).

The RestaurantApp class is the driver program that uses the 2 restaurant classes.
The RestaurantApp class demonstrates the use of Object Creation, Encapsulation, and method calling using printDetails().
Once the main method starts it will create a BjsRestaurant object with location set to Millenia, seating capacity 150, and false for hasBrewery.
it will then print out those details on the console show here:

Initial Details for BJ's Restaurant:
BJ's Restaurant Details:
Location: Millennia
Seating Capacity: 150
Has Brewery: No

Then the details will be updated.
Location will be set to I-Drive and seating capacity to 200
The I-Drive location also doesnt have a brewery so that detail wont change.

The updated info will be printed to the console:

Updated Details for BJ's Restaurant:
BJ's Restaurant Details:
Location: I-Drive
Seating Capacity: 200
Has Brewery: No

The other class AleHouse will also be printed out with the initial details of:

Initial Details for Ale House:
Millers Ale House Details:
Name: Millers Ale House
Specialty Drink: Craft Beer
Happy Hour Start Time: 5 PM

and similar to the Bjs class it will then be updated to display different inputs in the console:

Updated Details for Ale House:
Millers Ale House Details:
Name: Millers Ale House
Specialty Drink: Basil Hayden Smoked Cinnamon Old Fashioned
Happy Hour Start Time: 5 PM
