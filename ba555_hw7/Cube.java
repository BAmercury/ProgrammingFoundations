
public class Cube extends ThreeDShape
{
    // For surface area and volume of a cube we require:
    private double cube_edge_length;
    // Also require center point coordinates for cube
    private double cube_x, cube_y, cube_z;

    // Constructor
    public Cube(String shape_name, double edge_length, double x, double y, double z)
    {
        super(shape_name);
        this.cube_edge_length = edge_length;
        this.cube_x = x;
        this.cube_y = y;
        this.cube_z = z;
    }

    // Declare methods to get and set the edge length
    public double get_edge_length()
    {
        return this.cube_edge_length;
    }
    public void set_edge_length(double new_edge)
    {
        this.cube_edge_length = new_edge;
    }
    // Define the get area and volume method for a Cube
    // Use override to provide specfic implementation of a super-class provided method
    // Method for surface area
    @Override
    public double get_area()
    {
        return 6.0 * java.lang.Math.pow(this.cube_edge_length, 2);
    }
    // Method for volume
    @Override
    public double get_volume()
    {
        return java.lang.Math.pow(this.cube_edge_length, 3);
    }
}