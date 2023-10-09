import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String userSelection; // User's menu selection
        String userContinue; // Determines if the loop continues or stops
        double userInput; // User's metric they would like converted
        

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
            System.out.println("Kilometers per hour >> Miles per hour (1)");
            System.out.println("Kilograms >> pounds (2)");
            System.out.println("Celcious >> ferinheight (3)");
            System.out.println("Feet >> meters (4)");
            System.out.println("******************************************************");
            System.out.println("");
            System.out.print("Please make a selection: "); // Get user Selection
            userSelection = scanner.nextLine().toUpperCase();
            System.out.println("");
        }
    }
}
