// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 6 Part 2: 2D Arrays


// For Try-Catch Blocks Exception
import java.util.InputMismatchException;


/*

    This program demonstrates how to use 2-D arrays. 
    The user is prompted to input the following data:
        - sales person number
        - product number
        - sales amount
    The program will continuouly prompt the user 
    This input is checked for possible type errors (Mismatch exceptions) and then checked if it 
    meets the boundaries specfied in the assignment outlines (user validation)

    If mismatch errors occur, the program quits and the user must run the program again

    The data is saved to a 2-D array and totals are calculated by navigating through the rows and by columns

    The program then outputs the formatted table to the console and quits the program

*/


public class ba555_hw6p2 {


    public static void main(String[] args) {
        // Declare resuable variables for sales people and the product number
        int sales_worker = 0;
        int product = 0;
        // Declare variable for amount
        double amount = 0.0;
        // Declare reusable variable for grand total
        double grand_total = 0.0;
        // User dialogue to continue
        String user_ans = "";

        // Declare variables for # of employees and # of products
        // Will use these to construct the array 
        int NUM_EMPLOYEE = 5;
        int NUM_PRODUCT = 4;

        // Instantiate the scanner object to take in user input
        java.util.Scanner obj_scan = new java.util.Scanner(System.in);
        // Declare a boolean to control user input loop
        Boolean user_input = true;
        // Declare a boolean to control main program loop
        Boolean main_loop = true;
        // Declare a 2D array to store data
        double[][] sales_table = new double[NUM_EMPLOYEE][NUM_PRODUCT];
        // Main program loop
        while(main_loop)
        {   // Prompt user for data
            while(user_input)
            {

                /*
                    The following try-catch blocks are for the user input prompting
                    The exception that might be caught would be if the user inputs a string rather than a integer/double and vice versa
                    Along with this exception catching, user validation takes place to ensure the input meets the dictated boundaries:
                    Sales Person Number: [1,5]
                    Product Number: [1,4]
                    Amount: Must be greater than or equal to 0 (No Negative numbers)
                    Continue: Y/N or y/n to continue with user prompting or to move onto tabulating and calculations

                    If a mismatch error occurs here the program will quit and the user will have to restart it
                */

                // Try-Catch block for sales worker number
                try
                {
                    // Prompt the user for input
                    System.out.println("Enter sales person number (1-5): ");
                    sales_worker = obj_scan.nextInt();
                    // User validation if the sales number is correct
                    if (sales_worker >= 1 && sales_worker <= 5)
                    {
                        // Sales Worker number is valid, so we can continue with the prompting
                    }
                    else
                    {
                        // If user inputs an invalid employee ID just quit the program
                        System.out.println("Invalid Sales Person Number, Quitting the program");
                        user_input = false;
                        main_loop = false;
                    }

                }
                catch (InputMismatchException e)
                {
                    System.out.println("Invalid input, quitting the program");
                    user_input = false;
                    main_loop = false;
                    System.out.println(e);

                }
                
                // Try-Catch block for product number
                try
                {
                    // Prompt the user for a product number
                    System.out.println("Enter a product number: ");
                    product = obj_scan.nextInt();
                    // User validation if the product number is correct
                    if (product >= 1 && product <= 4)
                    {
                        // product number is valid, so we can continue with the prompting
                    }
                    else
                    {
                        // If user inputs an invalid employee ID just quit the program
                        System.out.println("Invalid Product Number, Quitting the program");
                        user_input = false;
                        main_loop = false;
                    }

                }
                catch (InputMismatchException e)
                {
                    System.out.println("Invalid input, quitting the program");
                    user_input = false;
                    main_loop = false;
                    System.out.println(e);
                }

                // Try-Catch block for sales amount
                try
                {
                    // Prompt user for the amount
                    System.out.println("Enter the amount: ");
                    amount = obj_scan.nextDouble();
                    // For user validation, amount needs to be a value that is greater or equal to zero
                    if (amount >= 0)
                    {
                        // We can continue
                    }
                    else
                    {
                        // If user inputs an invalid employee ID just quit the program
                        System.out.println("Invalid Amount Number, Quitting the program");
                        user_input = false;
                        main_loop = false;
                    }


                }
                catch(InputMismatchException e)
                {
                    System.out.println("Invalid input, quitting the program");
                    user_input = false;
                    main_loop = false;
                    System.out.println(e);

                }

                // Update table since we got past all user validation
                // Index by 0 so we must subtract one for row and column
                sales_table[sales_worker-1][product-1] += amount;
                

                // Try-Catch block for user secondary input
                try
                {
                    // Ask user if they want to continue inputting data
                    System.out.println("Would you like to continue? (Enter Y or N): ");
                    user_ans = obj_scan.next();
                    if (user_ans.equals("N") || user_ans.equals("n"))
                     {
                        System.out.println("Tabulating Data");
                        user_input = false;
                    }   
                    else if (user_ans.equals("Y") || user_ans.equals("y"))
                    {
                        System.out.println("Continuing data input");

                    }   
                    else
                    {
                        System.out.println("Input not valid, moving to tabulating data");
                        user_input = false;
                    }

                }
                catch(InputMismatchException e)
                {
                    System.out.println("Input not valid, quitting the program");
                    user_input = false;
                    main_loop = false;
                    System.out.println(e);

                }
                

            }


            // Display table

            // Print the headers. Using printf to format white spacing between the values these values were selected from repetitive testing
            System.out.printf("%7s%14s%14s%14s%14s%9s\n", "Product", "Salesperson 1","Salesperson 2", "Salesperson 3", "Salesperson 4","Total");
            // For loop to navigate rows of array
            for (int r=0; r <= 3; r++)
            {
                // Declare empty variable for cross totals (totals along rows)
                double cross_total = 0.0;
                // Print the product numbers column for every row
                // %d for integer
                System.out.printf("%d", (r + 1 ) );

                // For loop to navigate the columns of the array
                for (int c = 0; c < 4; c++)
                {
                    // Print corresponding column and row value from the table
                    System.out.printf("%14.2f", sales_table[c][r]);
                    // Update the row's cross total
                    cross_total += sales_table[c][r];
                }
                // Print the row's total and then move onto the next row by printing new line
                System.out.printf("%14.2f\n", cross_total);
            }


            // Compute grand totals at bottom of the table (column totals)
            System.out.printf("%5s\n", "Sales");
            System.out.printf("%5s\n", "Person");
            System.out.printf("%5s", "Total");
            // Will need another for loop to navigate over the columns and rows of the array
            for (int c = 0; c < 4; c++)
            {
                for (int r = 0; r <= 3; r++)
                {
                    // Moving along each column, and each row, compute grand total for each individual employee
                    grand_total += sales_table[c][r];

                }
                // Print out the grand total for the individual employee
                System.out.printf("%13.2f", grand_total);
                // Reset variable for next column computation
                grand_total = 0.0;

            }
            // Quit Program
            System.out.println();
            System.out.println("Thank you, exiting the program");
            main_loop = false;
        }
        

        
    }
}