

public class Sphere extends ThreeDShape
{
    // For surface area and volume of a sphere we require:
    private double sphere_radius;
    // We also require the center point coordinates
    private double sphere_x, sphere_y, sphere_z;

    // Constructor
    public Sphere(String shape_name, double radius, double x, double y, double z)
    {
        super(shape_name);
        this.sphere_radius = radius;
        this.sphere_x = x;
        this.sphere_y = y;
        this.sphere_z = z;
    }

    // Define get and set methods for radius
    public double get_radius()
    {
        return this.sphere_radius;
    }
    public void set_radius(double new_radius)
    {
        this.sphere_radius = new_radius;
    }
    // Define the get area and volume method for a Sphere
    // Use override to provide specfic implementation of a super-class provided method
    @Override
    public double get_area()
    {
        return 4.0 * java.lang.Math.PI * java.lang.Math.pow(this.sphere_radius, 2);
    }
    @Override
    public double get_volume()
    {
        return (4.0 / 3.0) * java.lang.Math.PI * java.lang.Math.pow(this.sphere_radius, 3);
    }
}

   