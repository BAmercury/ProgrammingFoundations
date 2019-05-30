// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 7: Inheritance
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileWriter;

/*

    This program serves as the driver program. The steps of this program are as follow:
        1. Read the shape data in (From a file called Data.txt)
        2. Store the data into a array list of shapes
        3. Loop through given array and output calculated values to a new file (Output.txt)

    Please refer to readme for furthur details regarding the input file format

*/


public class ba555_hw7
{

    // Declare Array list of shapes
    public static ArrayList<Shape> shapes;
    public static void main(String[] args) 
    {
        // Declare a scanner object to read in the shape data
        // Try-Catch Block for possible exceptoins thrown
        // New instance of the array list of shapes
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        try (Scanner scan = new Scanner(new File("Data.txt")))
        {

            // Look through the file while the scanner has a line to read
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
                        Circle cir = new Circle(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]));
                        shapes.add(cir);
                        break;
                    case "square":
                        Square sqr = new Square(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]));
                        shapes.add(sqr);
                        break;
                    case "triangle":
                        Triangle tri = new Triangle(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4]));
                        shapes.add(tri);
                        break;
                    case "sphere":
                        Sphere sph = new Sphere(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4]));
                        shapes.add(sph);
                        break;
                    case "cube":
                        Cube cub = new Cube(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4]));
                        shapes.add(cub);
                        break;
                    case "tetrahedron":
                        Tetrahedron tet = new Tetrahedron(line_arr[0].toLowerCase(), 
                        Double.parseDouble(line_arr[1]), 
                        Double.parseDouble(line_arr[2]), 
                        Double.parseDouble(line_arr[3]),
                        Double.parseDouble(line_arr[4]));
                        shapes.add(tet);
                        break;
                }                
            }
            // We are done using the scanner object in this case so close for now
            scan.close();
        }
        catch (Exception e)
        {
            System.out.println("Error reading in file. Please check format of input file and try again");
            System.out.println(e);
        }

        // Now use the filewriter object to write a new output file
        try (FileWriter writer = new FileWriter(new File("Output.txt")))
        {
            // Now iterate through the arraylist and output the corresponding data
            for (int i = 0; i < shapes.size(); i++)
            {
                // If its a 2D shape or 3D Shape
                String shape_name = shapes.get(i).get_name();
                //System.out.println(shape_name);
                if (shape_name.equals("circle") || shape_name.equals("square") || shape_name.equals("triangle"))
                {
                    // For a 2D shape, the get data method will simply return the area (formatted as a string)
                    String area = shapes.get(i).get_data();
                    // Compile string line to write to the output file
                    String to_write = shape_name + ":" + " Area=" + area + "\n";
                    writer.write(to_write);
                }
                else if(shape_name.equals("sphere") || shape_name.equals("cube") || shape_name.equals("tetrahedron"))
                {
                    String data = shapes.get(i).get_data(); // get data method for the 3DShape class returns comma delimited string of values
                    String data_arr[] = data.split(","); // Convert string to array
                    String area = data_arr[0]; // First index of array will be the area
                    String volume = data_arr[1]; // Second index of this array will be the volume
                    String to_write = shape_name + ":" + " Area=" + area + ", Volume=" + volume + "\n";
                    writer.write(to_write);
                }   

            }

            // Close the file writer program since we are done outputting
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println("Error in outputting file. Please ensure that the file isn't being used by another resource and try again");
            System.out.println(e);
        }
        
    }
}








