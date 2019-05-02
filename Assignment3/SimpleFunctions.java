// CS570 Assignment 3: Simple Functions Program
// Bhautik Amin

/*
    This Java program consists of two methods that will perform
    simple mathematics calculations. These functions are tested in the provided main function
*/


public class SimpleFunctions
{
    /*
        Distance formula method takes four values (Two sets of x,y points) with the double data type,
        performs the distance formula calculation, then returns the answer as a double
        data type. 

        Typical Usage:
            double answer = distance_formula(1.5, 2.5, 3.5, 4.5);

    */
    public static double distance_formula(double x1, double x2, double y1, double y2)
    {
        // Declare the answer return variable
        double answer;
        /* 
            Perform the calculation. We can use the sqrt() and pow() methods 
            found in the Math class native to the Java Programming Language 
        */
        answer = java.lang.Math.sqrt( java.lang.Math.pow( (x2 - x1), 2) + java.lang.Math.pow( ( y2- y1), 2) );
        // Return computed answer
        return answer;

    }

    /*
        Sphere Information method takes the radius of a given sphere (Given as a double data type), 
        performs the volume and surface area computations using it, then rounds the result to four decimal places, 
        followed by printing the results directly to the terminal

        Typical Usage:
            sphere_information(4.5);
    */
    public static void sphere_information(double radius)
    {
        // Declare the volume result and surface area results as doubles
        double volume_result;
        double sa_result;

        // Perform the volume computation
        // We can use the pi method from the Math Class native to the Java Programming langauge as well as pow()
        volume_result = (4/3) * java.lang.Math.PI * java.lang.Math.pow(radius, 3);


        // Perform the surface area computation
        // We can use the pi method from the Math Class native to the Java Programming langauge as well as pow()
        sa_result = 4 * java.lang.Math.PI * java.lang.Math.pow(radius, 2);


        /* 
            Round the results to 4 decimal places and print the result to terminal. 
            We can accomplish this using the DecimalFormat class native to the Java Programming Language
            Declare the Decimalformat datatype found in the text class that is native to the Java Programming Language
        */
        java.text.DecimalFormat format_obj = new java.text.DecimalFormat("#.####");
        /* 
            It should be noted that the formatter by default is configured for
            rounding mode HALF_EVEN. Which rounds towards the "nearest neighbor"
            More information for this rounding mode can be found:
            https://docs.oracle.com/javase/7/docs/api/java/math/RoundingMode.html#HALF_EVEN
        */

        // Use the formatter and print to the terminal
        // To use the formatter object the format method must be called
        System.out.println("Given Radius: " + radius);
        System.out.println("Volume: " + format_obj.format(volume_result));
        System.out.println("Surface Area: " + format_obj.format(sa_result));
    }


    public static void main (String[] args)
    {

        // Perform a demonstration of the distance formula method
        // Declare a variable with the double data type to store the output of the distance fomrula method
        double result;
        // Execute the method
        result = distance_formula(4.5, 5.5, 3.2, 1.1);
        // Print result
        System.out.println(result);

        // Perform a demonstration of the sphere information method
        // Declare a variable of double data type to store the radius of a given sphere
        double radius = 8.87;
        // Execute the method
        sphere_information(radius);
    }
}