// CS570 Assignment 4: Vending Machine Change Counter
// Bhautik Amin
// User ID: 13618816
// Email: ba555@drexel.edu

/*
    This Java program consists of a main function that will:
        - Prompt user for input (the amount of price for an item)
        - Validate the user input if it meets the specfic range and data type
        - Perform a calculation on what change to return to the user
        - Print the amount, change due, and the change itself (as quarters, nickels, and dimes)
        - Loop again to ask for input
        - Break loop if input isn't valid, while outputting to the user why the input was not valid
*/

// Import the Scanner object to get user input from console
import java.util.Scanner;


public class vending_machine
{

    public static void main(String[] args) 
    {
        // Control boolean to run main program loop
        boolean VEND_ON = true;
        // User validation control boolean to check if input is an integer that is divisible by 5
        boolean val_check = false;
        // Amount of money user gives ($1.00 by default)
        int input_money = 100; 
        // Declare a variable for user input (price of the item)
        int price_amount = 0;
        // Initialize the scanner object to obtain terminal input
        Scanner scanner = new Scanner(System.in);
        // Begin main program loop
        while (VEND_ON)
        {
            // Prompt user for input
            System.out.print("Hello! Item prices are: ");
            System.out.println("Between 25 cents to $1, in 5 cent increments");
            System.out.println("Enter price of item: ");
            try
            {   // Try to grab the input as integer. If the input is not an integer, this will catch the exception and alert the user
                price_amount = scanner.nextInt();
                // Validate the user input to check if it is divisible by 5
                val_check = (price_amount % 5) == 0; // If divisible by 5, then modulus should be 0 (TRUE)
            }
            catch (Exception e)
            {   
                // If the input was not a valid integer, alert user and quit out of main loop
                System.out.println("Input not valid. Please try again");
                VEND_ON = false;
                break;
            }
            // If the input was an integer and is valid
            if (val_check)
            {
                // Calculate the amount of change due
                int change_due = input_money - price_amount;
                // Calculate the amount of quarters
                int num_quarter = change_due / 25;
                // Calculate the amount of dimes based on change left
                int num_dime = (change_due - num_quarter*25) / 10;
                // Calculate amount of nickels based on change left
                int num_nickel = (change_due - num_quarter*25 - num_dime*10) / 5;

                // print the results
                System.out.print("You bought an item that was " + price_amount);
                System.out.println(" cents and gave me a dollar");
                System.out.println("Here is your change: ");
                System.out.println("Amount of change due (in cents): " + change_due);
                System.out.println("Quarters: " + num_quarter);
                System.out.println("Dimes: " + num_dime);
                System.out.println("Nickels: " + num_nickel);
                System.out.println("Have a nice day!");


            }
            else
            {
                System.out.println("Price of item is invalid, please try again");
                VEND_ON = false;
                break;

            }
            


        }


        
    }
}