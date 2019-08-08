import java.lang.Math;
import java.util.Scanner;
class ShapeManager {
  
  public static void main(String[] args) {
    
    // declare variables
    Scanner input = new Scanner(System.in);
    Shape2D[] shapes = new Shape2D[100];
    int newArea;
    
    // instantiate shapes
    shapes[0] = new Circle(3);
    shapes[1] = new Square(2);
    
    // output shape dimensions
    System.out.println("Circle has a radius of " + ((Circle)shapes[0]).getRadius() + " and area " + ((Circle)shapes[0]).getArea());
    System.out.println("Square has a length of " + ((Square)shapes[1]).getLength() + " and area " + ((Square)shapes[1]).getArea());
    
    // declaring new area for all shapes
    System.out.println("\nWhat should the new area be?");
    newArea = input.nextInt();
    changeAreas(shapes, newArea);
    
    // outputting changed dimensions
    System.out.println("\nCircle has a radius of " + ((Circle)shapes[0]).getRadius() + " and area " + ((Circle)shapes[0]).getArea());
    System.out.println("Square has a length of " + ((Square)shapes[1]).getLength() + " and area " + ((Square)shapes[1]).getArea());
  }                    
  
  public static void changeAreas(Shape2D[] shapes, int newArea) {
    for (int i=0; i<shapes.length; i++) {
      if (shapes[i] instanceof Circle) {
        ((Circle) shapes[i]).setRadius(Math.sqrt(newArea/Math.PI));
      } else if (shapes[i] instanceof Square) {
        ((Square) shapes[i]).setLength(Math.sqrt(newArea));
      }
    }
  }
}
      