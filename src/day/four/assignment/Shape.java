package day.four.assignment;

public class Shape {
    void printShape(){
        System.out.println("This is a shape");
    }
}
class Polygon extends Shape{
    void printShape(){
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon{
    void printShape(){
        System.out.println("Rectangle is a polygon");
    }
}
class Triangle extends Polygon{
    void printShape(){
        System.out.println("Triangle is a polygon");
    }
}
class Square extends Rectangle{
    void printShape(){
        System.out.println("Square is a rectangle");
    }
}

class MainShape{
    public static void main(String[] args) {
        Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.printShape();
        polygon.printShape();
        rectangle.printShape();
        triangle.printShape();
        square.printShape();
    }
}