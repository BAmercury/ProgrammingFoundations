// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 8: Stack Data Structures


import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Stack;
import java.util.ArrayList;


/*


    1. Read in file
    2. Save file lines to a list
    3. Pop string out of list and check if its balanced
    4. Save result to a new list that will be used to print


*/


public class ba555_hw8 {



    // Declare input buffer list
    public static ArrayList<String> input_list;
    // Declare output buffer list
    public static ArrayList<String> output_list;

    // Method for checking if the expression is balanced
    public static boolean CheckBal(String exp)
    {
        // Declare return variable
        // true by default. Conditoinal check statements
        // in this method will flip this bool to false
        boolean result = true;
        // Declare a new Stack to collect left-most paranthesis
        Stack<Character> stack = new Stack<Character>();
        // Navigate the string from left to right
        for (int i = 0; i < exp.length(); i++)
        {
            Character c_index = exp.charAt(i);

            // Check to see if the character at given index is 
            // a left most paranthesis
            switch(c_index)
            {
                case '(':
                    stack.push(c_index);
                    break;
                case '{':
                    stack.push(c_index);
                    break;
                case '[':
                    stack.push(c_index);
                    break;
            }

            // If the character is a right most paranthesis
            // If so, check the stack to see if it's partner is there
            switch (c_index)
            {
                case ')':
                    if (stack.peek() != '(')
                    {
                        result = false;
                    }
                    else
                    {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.peek() != '{')
                    {
                        result = false;
                    }
                    else
                    {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.peek() != '[')
                    {
                        result = false;
                    }
                    else
                    {
                        stack.pop();
                    }
                    break;
            }

            // Check to ensure the stack is empty
            // If not empty, then the expression must
            // be unbalanced
            if (stack.isEmpty())
            {
               result = true;
            }
            else
            {
                result = false;
            }

        }


        return result;
    }




    public static void main(String[] args) 
    {

        // Declare a scanner object to read in the case data
        // Try-Catch block to catch possible File IO exceptions

        // New instance of input buffer list for the strings
        ArrayList<String> input_list = new ArrayList<String>();
        try (Scanner scan = new Scanner(new File("Data.txt")))
        {
             // Look through the file while the scanner has a line to read
            while (scan.hasNext())
            {
                // Get line
                String line = scan.nextLine();
                // Save to input array
                input_list.add(line);
            }

            // Close scanner object once completed
            scan.close();
        }
        catch (Exception e)
        {
            System.out.println("Error reading in file. Please check format of file and try again");
            System.out.println(e);

        }

        // Go through strings in the input buffer and check if it's balanced
        // Output full string results in an output buffer
        ArrayList<String> output_list = new ArrayList<String>();

        for (int i = 0; i < input_list.size(); i++)
        {
            // Grab a string
            String to_check = input_list.get(i);
            // Check to see if it's balanced
            boolean result = CheckBal(to_check);
            // Generate output string to be written to file
            String checked_string = "";
            if (result)
            {
                checked_string = to_check + ":" + "\t" + "proper" + "\n";
            }
            else
            {
                checked_string = to_check + ":" + "\t" + "improper" + "\n";
            }
            // Add output string to output buffer list
            output_list.add(checked_string);
        }

        // Use filewriter object to output results
        // Try catch block to catch possible File IO exceptions
        try (FileWriter writer = new FileWriter(new File("Output.txt")))
        {
            System.out.println("Printing results");
            for (int i = 0; i < output_list.size(); i++)
            {
                
                writer.write(output_list.get(i));
            }

            // Close file writer program once completed
            writer.close();

        }
        catch (Exception e)
        {
            System.out.println("Error writing file. Please try again");
            System.out.println(e);

        }


        
    }
}