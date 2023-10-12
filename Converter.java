import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Determin user menu selection
        String userSelection;
        String userContinue;

        // Menu options
        double userFahrenheit;
        double userCelsius;

        double userPounds;
        double userKilograms;

        double userMPH;
        double userKPH;

        double userFeet;
        double userMeters;

        while (true) {
            System.out.println("Welcome to the metric converter!!");
            System.out.println("******************************************************");
            System.out.print("Do you wish to continue? (Y/N)");
            userContinue = scanner.nextLine().toUpperCase();

            if (userContinue.equals("N")) {
                System.out.println("Exiting...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            } else if (!userContinue.equals("Y")) {
                System.out.println("Invalid input. Please enter Y or N");
                continue;
            }

            System.out.println("");
            System.out.println("------------------------------------------------------");
            System.out.println("Please select from the following converters: ");
            System.out.println("------------------------------------------------------");
            System.out.println("");
            System.out.println("(1) Miles per hour >> Kilometers per hour");
            System.out.println("(2) Pounds >> Kilograms");
            System.out.println("(3) Fahrenheit >> Celsius");
            System.out.println("(4) Feet >> Meters");
            System.out.println("");
            System.out.println("******************************************************");
            System.out.println("");
            System.out.print("Please make a selection: ");
            userSelection = scanner.nextLine();

            if (userSelection.equals("1")) {
                System.out.println("You selected Miles per hour >> Kilometers per hour.");
                System.out.print("How many miles per hour would you like to convert to kilometers? ");
                userMPH = scanner.nextDouble();
                scanner.nextLine();
                userKPH = userMPH * 1.60934;
                System.out.println(userMPH + " Miles per hour = " + userKPH + " Kilometers per hour.");
                System.out.println("");

            } else if (userSelection.equals("2")) {
                System.out.println("You selected Pounds >> Kilograms.");
                System.out.print("How many pounds do you wish to convert to kilograms? ");
                userPounds = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                userKilograms = userPounds / 2.2046;
                System.out.println(userPounds + " pounds = " + userKilograms + " kilograms.");
                System.out.println("");

            } else if (userSelection.equals("3")) {
                System.out.println("You selected Fahrenheit >> Celsius.");
                System.out.print("How many degrees in Fahrenheit do you wish to convert to Celsius? ");
                userFahrenheit = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                userCelsius = (userFahrenheit - 32) * 5 / 9;
                System.out.println(userFahrenheit + " degrees Fahrenheit = " + userCelsius + " degrees Celsius.");
                System.out.println("");

            } else if (userSelection.equals("4")) {
                System.out.println("You selected Feet >> Meters.");
                System.out.print("How many feet do you wish to convert to meters? ");
                userFeet = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                userMeters = userFeet / 3.28084;
                System.out.println(userFeet + " Feet = " + userMeters + " Meters.");
                System.out.println("");

            } else {
                System.out.println("Invalid response, please choose from the selection menu (1, 2, 3, 4): ");
                 try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }scanner.close();
    }
}
