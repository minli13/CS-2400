import java.util.Scanner;  // Import the Scanner class

public class Coins {
    public static void main(String[] args) {
        // Get input
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        float owed = 0;

        do {
            System.out.println("How much change owed in dollars: ");
            owed = myObj.nextFloat();
        }
        while (owed < 1);

        // Convert to dollar
        owed = owed * 100;

        // Initialize coin types
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        // Calculate quarters
        if (owed > 24) {
            while (true) {
                owed = owed - 25;
                quarters += 1;
                if (owed < 25) {
                    break;
                }
            }
        }

        // Calculate dimes
        if (owed > 9) {
            while (true) {
                owed = owed - 10;
                dimes += 1;
                if (owed < 10) {
                    break;
                }
            }
        }

        // Calculate nickels
        if (owed > 4) {
            while (true) {
                owed = owed - 5;
                nickels += 1;
                if (owed < 5) {
                    break;
                }
            }
        }

        // Calculate pennies
        if (owed > 0) {
            while (true) {
                owed = owed - 1;
                pennies += 1;
                if (owed == 0) {
                    break;
                }
            }
        }

        // Print results
        if (quarters > 0) {
            System.out.print(quarters + " quarters ");
        }

        if (dimes > 0) {
            System.out.print(dimes + " dimes ");
        }

        if (nickels > 0) {
            System.out.print(nickels + " nickels ");
        }

        if (pennies > 0) {
            System.out.print(pennies + " pennies");
        }

        System.out.println();
    }
}