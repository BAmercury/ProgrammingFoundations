// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 5 Part 2: Recursive Solution for Palindrome Evaluation
import java.util.Scanner;
/*
    This program is an recursive solution that prompts the user to give a word
    and then recursivley evaluates the first and last index of the word from both sides
    to see if it matches the requirements to be a valid palindrome
*/


public class ba555_hw5p2
{
/*
        palindromeTester is a method that returns if a given string word is a palindrome or not
        Typical Application:
            Boolean result = palindromeTester("racecar");
            > result = true

        Method Explanation: 
        This method is recursive. It evaluates the first and last index char's of a given string
        to see if it does not match. If it does not match, the given string cannot be a palindrome.
        Otherwise, the method will trim the just evalauted conjugate pair and recursively call the method again
        on a new trimmed string (containing the rest of the conjugate pairs that still have yet to be evaluated)
        It will continue calling on itself until the string cannot be trimmed anymore
    */
    public static Boolean palindromeTester(String word)
    {
        // If the string has 0 or 1 character, it is a palindrome
        if (word.length() < 2)
        {
            return true;
        }
        // Otherwise check the first index char of the given string to see
        // it matches the last index char. If they do not match, then this word
        // cannot be a palindrome
        // the .charAt() method allows to index into the string at a given integer
        if (word.charAt(0) != word.charAt(word.length() - 1))
        {
            return false;
        }
        // For recursion, this same method must be called again
        // Trim the string so we can access the next conjugate of char's
        
        // Trim the first and last characters from the string
        // Then recursively call the function again on the trimmed string to continue the evaluation
        // Declare empty string
        String trimmed = "";
        // From the next index (1, since Java is 0 indexed) to the index before the last index (not inclusive due to the < sign)
        // append the characters together into a new trimmed string
        for (int i = 1; i < word.length() - 1; i++)
        {
            trimmed = trimmed + word.charAt(i);
        }
        // Recursively call the method onto this new trimmed string and start the evaulation again
        return palindromeTester(trimmed);
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