CS570 Assignment 7
ba555
Bhautik Amin
Drexel ID: 13618816

My submission contains the following files:
    - ba555_hw7.java
    - Circle.java
    - Square.java
    - Cube.java
    - Sphere.java
    - Triangle.java
    - Tetrahedron.java
    - Shape.java
    - TwoDShape.java
    - ThreeDShape.java

Shape Class:

The Shape class (With its corresponding subclasses) I implemented consists of the following members:
    - private variable to store the shape's name, with public getters and setters to access
    - public abstract methods for getting the area and the volume (Depending on if its 2D or 3D)

For the area and volume abstract methods, the individual subclasses (Circle, Square, Sphere, etc.)
redefines/overrides the abstract definition with a specfic implementation that is custom to the type of shape
it is. This abstraction allows for each shape to have its corresponding area and volume functions that
can be accessed pubically using a get method in the outmost class (the Shape class, method is called get_data)
This get data method returns the data formatted as a string. For the 3D shapes, the string specfically is comma delimited string containing both area and volume

Main driver file:
The steps of this driver program are to be:
    1. Read the shape data in from a file (called Data.txt)
    2. Store data in an array list of shape data
    3. Loop through array and output calculated data to a new file (Called Output.txt)

The format for the input file should be (Without the brackets)
[shape name (lowercase)] [calculation argument: radius base height etc. ] [coordinate argument: x y z coords]
Each line is delimited using a space. The calculation argument is custom to the shape, for example a circle will require radius
whereas a triangle will need base and height. The coordinate argument is for the center point of the shape (x and y for 2D and x, y, z for 3D)

Here is a sample input file format (File must be called Data.txt):
circle 5 0 0 
square 5 0 0
triangle 4 5 0 0
sphere 5 0 0 0
cube 4 0 0 0
tetrahedron 4 0 0 0

For each individual shape the data is as follows:
circle radius x y
square side_length x y
triangle base height x y
sphere radius x y z
cube side_edge_length x y z
tetrahedron sidge_edge_length x y z


Note that the shape name should ideally be lowercase, but the code is designed to handle uppercase words
by converting it to lowercase for the evaluations. Note that the output file will have lowercase headers


Error Handling:

In the case where the input file is formatted incorrectly, for example if only the shape name is inputted
but with no data to follow:
circle
square 5 0 0

Correct format:
circle 3 1 1
square 2 0 0

The driver program is designed to read in files, as well as write them, using try-catch blocks. The exception catch will print to the user
that an error in reading/writing the file has occured. And it will instruct them to simply restart the program after evaluating the correctness of the input file
or check to see if another resource is using the output file. In addition to this, the program will also print the specfic java exception for relevance