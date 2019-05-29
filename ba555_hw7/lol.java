import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {

try {

Scanner sc = new Scanner(new File("Shapes.txt"));

ArrayList<Shape> shapes = new ArrayList<Shape>();

while (sc.hasNext()) {

String str = sc.nextLine();

String arr[] = str.split(" ");

if (arr[0].equals("circle")) {

double x = Double.parseDouble(arr[1]);

double y = Double.parseDouble(arr[2]);

double r = Double.parseDouble(arr[3]);

shapes.add(new Circle(arr[0], x, y, r));

} else if (arr[0].equals("square")) {

double side = Double.parseDouble(arr[1]);

shapes.add(new Square(arr[0], side));

} else if (arr[0].equals("triangle")) {

double base = Double.parseDouble(arr[1]);

double height = Double.parseDouble(arr[2]);

shapes.add(new Triangle(arr[0], base, height));

} else if (arr[0].equals("cube")) {

double side = Double.parseDouble(arr[1]);

shapes.add(new Cube(arr[0], side));

} else if (arr[0].equals("sphere")) {

double r = Double.parseDouble(arr[1]);

shapes.add(new Sphere(arr[0], r));

}

}

sc.close();

FileWriter fw = new FileWriter(new File("OutputFile.txt"));

for (int i = 0; i < shapes.size(); i++) {

fw.write(shapes.get(i)+"\n");

}

fw.close();

System.out.println("** Data Written to output file **");

} catch (FileNotFoundException e) {

e.printStackTrace();

} catch (IOException e) {

e.printStackTrace();

}

}

}