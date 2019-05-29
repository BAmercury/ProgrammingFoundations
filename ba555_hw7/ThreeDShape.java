

public abstract class ThreeDShape extends Shape
{
    // Constructor Definition
    public ThreeDShape(String shape_name)
    {
        // Use the parent class constructor to instantiate the class
        super(shape_name);
    }

    // Get Area and Volume Methods
    // This method will be different for each shape so make it abstract
    // Indvidual shape subclasses will inherit this method and change it to fit the needs
    //public abstract double get_area();
    //public abstract double get_volume();

}

