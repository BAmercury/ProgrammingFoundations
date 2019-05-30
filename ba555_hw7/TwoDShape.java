public abstract class TwoDShape extends Shape
{
    // Constructor Definition
    public TwoDShape(String shape_name)
    {
        // Use the parent class constructor to instantiate the class
        super(shape_name);
    }

    public abstract double get_area();


    // Define the get data method
    // For 2D shape we just need to return the area
    @Override
    public String get_data()
    {
        return Double.toString(this.get_area());
    }
    
}

