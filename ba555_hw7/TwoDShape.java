

public abstract class TwoDShape extends Shape
{
    // Constructor Definition
    public TwoDShape(String shape_name)
    {
        // Use the parent class constructor to instantiate the class
        super(shape_name);
    }

    // Get Area Method
    // This method will be different for each shape so make it abstract
    // Indvidual shape subclasses will inherit this method and change it to fit the needs
    public abstract double get_area();
}

