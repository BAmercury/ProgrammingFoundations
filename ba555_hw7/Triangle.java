// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 7: Inheritance

public class Triangle extends TwoDShape
{
    // For area of a triangle we require the base and height length
    private double triange_base;
    private double triangle_height;

    // Also require the center coordinates
    private double triangle_x;
    private double triangle_y;

    // Constructor
    public Triangle(String shape_name, double base, double height, double x, double y)
    {
        super(shape_name);
        this.triange_base = base;
        this.triangle_height = height;
        this.triangle_x = x;
        this.triangle_y = y;
    }

    // Declare methods to get and set the base and height
    public double get_base()
    {
        return this.triange_base;
    }
    public void set_base(double new_base)
    {
        this.triange_base = new_base;
    }
    public double get_height()
    {
        return this.triangle_height;
    }
    public void set_height(double new_height)
    {
        this.triangle_height = new_height;
    }

    // Define the get_area method for a Triangle
    // Use override to provide specfic implementation of a super-class provided method
    @Override
    public double get_area()
    {
        return 0.5 * this.triange_base * this.triangle_height;
    }
}
