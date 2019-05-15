// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 5 Part 1: Iterative Solution for Palindrome Evaluation
import java.util.Scanner;
/*
    This program is an iterative solution that prompts the user to give a word
    and then iterates over the characters of that word from both sides to see if it matches
    the requirements to be a palindrome
*/

public class ba555_hw5p1 
{

    /*
        palindromeTester is a method that returns if a given string word is a palindrome or not
        Typical Application:
            Boolean result = palindromeTester("racecar");
            > result = true

        Method Explanation: 
        This method is iterative and uses two 'pointer' variables
        to navigate from the front and back of the word. It will check to see if
        these characters match/don't match. If they do not match, then the word is not a palindrome
        otherwise the loop will continue and the pointers will increment/decrement across the word until
        they converge
    */
    public static Boolean palindromeTester(String word)
    {
        // If the string has 0 or 1 character, it is a palindrome
        if (word.length() < 2)
        {
            return true;
        }
        // Otherwise iterate through both ends of the word and see if it matches
        else
        {
            // Create two pointers that will be used to navigate the front and back of the string array
            int start_index = 0;
            int end_index = word.length() - 1; // '-1' because Java is 0 indexed
            // Boolean to control while loop
            Boolean control_bool = true;

            // Iterate through the string, exit loop if not a palindrome
            while(control_bool)
            {   // Check to see if the character at the start and end indicies match
                // If they do not, exit the loop. The word is not a palindrome
                // the .charAt() method allows to index into the string at a given integer
                if (word.charAt(start_index) != word.charAt(end_index))
                {
                    control_bool = false;
                    return false;
                }
                // Otherwise update the pointers and check again in the next cycle
                // Exit the while loop if we end up going through the whole word
                else
                {
                    // If the end index is larger than the start index, we still have more of the 
                    // word to get through
                    if (end_index > start_index)
                    {
                        // Increment the start index to move onto the next character
                        start_index = start_index + 1;
                        // Decrement the end index to move back one character
                        end_index = end_index - 1;
                    }
                    else
                    {
                        // We ended up going through the whole word, and it is a palindrome
                        control_bool = false;
                        return true;
                    }

                }
            }
            // Default return statement of the function in the case the while loop's 
            // conditional statements are not hit at all
            // If the while loop somehow breaks without returning anything from the 
            // above conditional statements, return false by default
            return false;


        }
    }



    public static void main(String[] args) 
    {
        // Setup a boolean to control a while loop
        Boolean control_bool = true;

        // Declare a variable to store result of palindrome testing
        Boolean result = false;
        // Delcare a variable to store the user input
        String user_input = "";
        // Initialize the scanner object to obtain terminal input
        Scanner scanner = new Scanner(System.in);
        // Start main loop
        while(control_bool)
        {
            // Prompt for user input
            System.out.println("Enter a word: ");
            try
            {

                user_input = scanner.nextLine();
                result = palindromeTester(user_input);
                if (result)
                {
                    System.out.println("The given string is a palindrome");
                }
                else
                {
                    System.out.println("The given string is NOT a palindrome");
                }
            }
            catch (Exception e)
            {
                System.out.println("Input was not valid, please try again");
                System.out.println(e);
                control_bool = false;
                break;
            }

            // Ask user to continue testing
            System.out.println("Would you like to test another word? (Y/N)");
            try{

                user_input = scanner.nextLine();
                // Allow user to input caps or no caps
                if (user_input.equals("N") || user_input.equals("n"))
                {
                    System.out.println("Quitting the program");
                    control_bool = false;
                    break;
                }
                else if (user_input.equals("Y") || user_input.equals("y"))
                {
                    System.out.println("Continuing the program");

                }
                else
                {
                    System.out.println("Input not valid, continuing the program");
                }

            }
            catch (Exception e)
            {
                System.out.println("Input was not valid, please try again");
                System.out.println(e);
                control_bool = false;
                break;
            }


        }
        
    }
}