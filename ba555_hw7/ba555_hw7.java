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


    public static ArrayList<Shape> shapes;
    public static void main(String[] args) 
    {
        // Declare a scanner object to read in the shape data
        // Try-Catch Block for possible exceptoins thrown
        // New instance of the array list of shapes
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        try (Scanner scan = new Scanner(new File("Data.txt")))
        {

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
            System.out.println("Error reading in file: ");
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
                    double area = shapes.get(i).get_area();
                    String to_write = shape_name + ":" + " Area=" + area + "\n";
                    writer.write(to_write);
                }
                else if(shape_name.equals("sphere") || shape_name.equals("cube") || shape_name.equals("tetrahedron"))
                {
                    double area = shapes.get(i).get_area();
                    double volume = shapes.get(i).get_volume();
                    String to_write = shape_name + ":" + " Area=" + area + ", Volume=" + volume + "\n";
                    writer.write(to_write);
                }   

            }

            // Close the file writer program since we are done outputting
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println("Error in outputting file");
            System.out.println(e);
        }
        
    }
}








