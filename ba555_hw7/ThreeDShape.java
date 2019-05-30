// ba555
// Bhautik Amin
// Drexel ID: 13618816
// CS570 Assignment 7: Inheritance

public abstract class ThreeDShape extends Shape
{
    // Constructor Definition
    public ThreeDShape(String shape_name)
    {
        // Use the parent class constructor to instantiate the class
        super(shape_name);
    }
    public abstract double get_area();
    public abstract double get_volume();


    // Define the get data function for a 3D shape
    // For 3D shape we must return both area and volume
    // In order to return both, compile into single comma delimited string
    @Override
    public String get_data()
    {
        return Double.toString(this.get_area()) + "," + Double.toString(this.get_volume());
    }


}

