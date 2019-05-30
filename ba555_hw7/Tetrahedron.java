// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 7: Inheritance

public class Tetrahedron extends ThreeDShape
{
    // For area and volume of a Tetrahedron we require:
    private double tetra_edge_length;
    // Center point coordinates
    private double tetra_x, tetra_y, tetra_z;

    // Constructor
    public Tetrahedron(String shape_name, double edge_length, double x, double y, double z)
    {
        super(shape_name);
        this.tetra_edge_length = edge_length;
        this.tetra_x = x;
        this.tetra_y = y;
        this.tetra_z = z;
    }

    // Define get and set methods for edge length
    public double get_edge_length()
    {
        return this.tetra_edge_length;
    }
    public void set_edge_length(double new_edge)
    {
        this.tetra_edge_length = new_edge;
    }

    // Define the get area and volume method for a Tetrahedron
    // Use override to provide specfic implementation of a super-class provided method
    //@Override
    public double get_area()
    {
        return java.lang.Math.sqrt(3) * java.lang.Math.pow(this.tetra_edge_length, 2);
    }
    //@Override
    public double get_volume()
    {
        return java.lang.Math.pow(this.tetra_edge_length, 3) / (6.0 * java.lang.Math.sqrt(2));
    }
}