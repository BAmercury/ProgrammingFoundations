// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 7: Inheritance

public class Square extends TwoDShape
{
    // Input needed to calculate the area of a square would be simply the length of a  single side
    // Declare private variables 
    private double square_side_length;
    // We need to have the center coordinates as well
    private double square_x;
    private double square_y;

    // Constructor
    public Square(String shape_name, double side_length, double x, double y)
    {
        // Use the TwoDShape constructor (Which users the main class Shape constructor) to instaniate object
        super(shape_name);

        this.square_side_length = side_length;
        this.square_x = x;
        this.square_y = y;
    }

    // Method to get and set the side length
    public double get_side_length()
    {
        return this.square_side_length;
    }
    // User will need to rerun the get_area method again if this is ran
    public void set_side_length(double new_length)
    {
        this.square_side_length = new_length;

    }

    // Define the get_area method for a Square
    // Use override to provide specfic implementation of a super-class provided method
    @Override
    public double get_area()
    {
        return java.lang.Math.pow(this.square_side_length, 2);
    }


}

