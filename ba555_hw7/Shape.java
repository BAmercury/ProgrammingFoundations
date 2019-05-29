

public class Shape
{
    // Shape Name
    private String shape_name;
    // Constructor for class
    public Shape(String shape_name)
    {
        this.shape_name = shape_name;
    }
    
    
    // Define get and set methods to manipulate the private variable name
    public String get_name()
    {
        return this.shape_name;
    }

    public void set_name(String new_name)
    {
        this.shape_name = new_name;
    }
}

