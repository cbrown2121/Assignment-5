import java.util.Scanner;
// LETS TURN THE ALL THE MENU OPTIONS INTO METHODS

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String userSelection; // User's menu selection
        String userContinue; // Determines if the loop continues or stops
        double userConversion; // Users value they wish to convert 
        
        // Menu option 1
        double userFerinheight;
        double userCelsius;

        // Menu option 2
        double userPounds;
        double userKilograms;

        // Menu option 3
        double userMPH;
        double userKPH;

        // Menu option 4
        double userFeet;
        double userMeters;

        // Begin while loop
        while (true) {

            // Display welcome menu
            System.out.println("Welcome to the metric converter!!");
            System.out.println("******************************************************");
            System.out.print("Do you wish to continue? (Y/N)"); // Determine if loop continues or breaks
            userContinue = scanner.nextLine().toUpperCase();

            if (userContinue.equals("Y")) {
                System.out.println("Loading...");

            } else if (userContinue.equals("N")) {
                System.out.println("Exiting");
                break;

            } else {
                System.out.println("Invalid input. Please enter Y or N");
                userContinue = scanner.nextLine().toUpperCase();
            }

            // Display rest of welcome menu
            System.out.println("");
            System.out.println("Please select from the following converters: ");
            System.out.println("Miles per hour >> Kilometers per hour (1)");
            System.out.println("Pounds >> Kilograms (2)");
            System.out.println("Ferinheight >> Celcious (3)");
            System.out.println("Feet >> meters (4)");
            System.out.println("******************************************************");
            System.out.println("");
            System.out.print("Please make a selection: "); // Get user Selection
            userSelection = scanner.nextLine();
            System.out.println("");

            // If statements to run depending on user selection
            // Miles >> Kilometers
            if (userSelection.equals("1")){
                System.out.println("You selected Miles per hour >> Kilometers per hour.");
                System.out.print("How many miles per hour would you like to convert to kilometers? ");
                userConversion = scanner.nextDouble();   

            // Pounds >> kilograms    
            } else if (userSelection.equals("2")) {
                System.out.println("You selected Pounds >> Kilograms.");
                System.out.print("How many pounds do you wish to convert to kilograms? ");
                userConversion = scanner.nextDouble();

            // Ferinheight >> Celcious
            } else if (userSelection.equals("3")) {
                System.out.println("You selected Ferinheight >> Celcious.");
                System.out.println("How many degrees in ferinheight do you wish to convert to celcius? ");
                userConversion = scanner.nextDouble();

            // Feet >> meters
            } else if (userSelection.equals("4")) {
                System.out.println("You selected Feet >> Meters.");
                System.out.print("How many feet do you wish to convert to meters? ");
                userConversion = scanner.nextDouble();

            // Invalid response, get a valid response from user
            } else {
                System.out.print("Invalid response, please choose from the selection menu. (1,2,3,4): ");
                userSelection = scanner.nextLine();
            }
        }
    }
}
