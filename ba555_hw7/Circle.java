// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 7: Inheritance

public class Circle extends TwoDShape
{
    // For area of a circle the following information will be needed: (x,y) coords and radius
    private double circle_radius;
    private double circle_x;
    private double circle_y;

    // Constructor
    public Circle(String shape_name, double radius, double x, double y)
    {
        super(shape_name);
        this.circle_radius = radius;
        this.circle_x = x;
        this.circle_y = y;

    }

    // Define methods to get and set the radius
    public double get_radius()
    {
        return this.circle_radius;
    }
    public void set_radius(double new_radius)
    {
        this.circle_radius = new_radius;
    }

    // Define the get_area method for a Circle
    // Use override to provide specfic implementation of a super-class provided method
    @Override
    public double get_area()
    {
        return java.lang.Math.PI * java.lang.Math.pow(this.circle_radius, 2);
    }
}

