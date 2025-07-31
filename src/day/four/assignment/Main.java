package day.four.assignment;

public class Main {
    public static void main(String[] args) {
    ThreeD point1 = new ThreeD();
    point1.setX(1);
    point1.setY(2);
    point1.setZ(3);
    ThreeD point2 = new ThreeD(4,5,6);

    double dist = point1.distance(point2);
    System.out.println("Distance between point1 and point2: " + dist);
    }
}
