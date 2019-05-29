import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileWriter;

/*

The steps of this driver program are to be:
    1. Read the shape data in
    2. Store data in an array of shape data
    3. Loop through array and output to a new file


*/


public class ba555_hw7
{

    // Declare a list of Shapes (the class)
    public static ArrayList<Shape> shapes;
    public static void main(String[] args) 
    {
        // Declare a scanner object to read in the shape data
        // Try-Catch Block for possible exceptoins thrown
        try (Scanner scan = new Scanner(new File("Data.txt")))
        {
            // New instance of the array list of shapes
            shapes = new ArrayList<Shape>();

            // Look through the file
            while (scan.hasNext() )
            {
                // Get the entire line
                String line = scan.nextLine();
                // The lines should be separated using spaces as the delimiter
                String line_arr[] = line.split(" ");
                // Depending on the first string we must insaniate the corresponding class
                // Make sure the entire string is lower case, this eval statement for the switch statement
                // will ensure that the string is lower case
                switch (line_arr[0].toLowerCase())
                {
                    case "circle":
                        shapes.add(new Circle(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3])));
                        break;
                    case "square":
                        shapes.add(new Square(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3])));
                        break;
                    case "triangle":
                        shapes.add(new Triangle(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4])));
                        break;
                    case "sphere":
                        shapes.add(new Sphere(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4])));
                        break;
                    case "cube":
                        shapes.add(new Cube(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4])));
                        break;
                    case "tetrahedron":
                        shapes.add(new Tetrahedron(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4])));
                        break;
                }                
            }
            // We are done using the scanner object in this case so close for now
            scan.close();
        }
        catch (Exception e)
        {
            System.out.println("Error reading in file: ");
            System.out.println(e);
        }

        // Now use the filewriter object to write a new output file

        
    }
}








