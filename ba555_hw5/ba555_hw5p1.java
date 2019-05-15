import java.util.Scanner;

// Write an iterative program called PalidromeTester which tests whether a given string is a
// palindrome


/*
Enter a potential palindrome: 
radar

That string IS a palindrome.

Test another palindrome (y/n)? y
Enter a potential palindrome: 
abracadabra

That string is NOT a palindrome.

Test another palindrome (y/n)? y
Enter a potential palindrome: 
able was I ere I saw elba



*/

/**
 * ba555_hw5p1
 */
public class ba555_hw5p1 
{

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
            int end_index = word.length() - 1;
            // Boolean to control while loop
            Boolean control_bool = true;

            // Iterate through the string, exit loop if not a palindrome
            while(control_bool)
            {   // Check to see if the character at the start and end incicies match
                // If they do not, exit the loop. The word is not a palindrome
                if (word.charAt(start_index) != word.charAt(end_index))
                {
                    control_bool = false;
                    return false;
                }
                // Otherwise update the pointers and check again in the next cycle
                // Exit the while loop if we end up going through the whole word
                else
                {
                    if (start_index > end_index)
                    {
                        start_index = start_index + 1;
                        end_index = end_index - 1;
                    }
                    else
                    {
                        control_bool = false;
                        return true;
                    }

                }
            }
            return true;


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
                System.out.println(result);
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