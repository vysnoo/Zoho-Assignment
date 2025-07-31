package day.four.assignment;

import java.util.Scanner;

public class Circle extends Point{
    private int radius;
    Circle(){
        super();
        this.radius=1;
    }

    public void setRadius(int radius){
        this.radius=(radius>0)?radius:1;
    }
    public int getRadius(){
        return this.radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        circle.setPoint(x, y);
        circle.setRadius(radius);

        System.out.println("Circle center is " + circle.toString());
        System.out.println("Radius is " + circle.getRadius());
        System.out.println("Area is " + String.format("%.2f", circle.area()));
    }
}
