package day.four.assignment;

public class Point {
    private int x;
    private int y;
    Point(){
        this.x=0;
        this.y=0;
    }
    public void setPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void printPoint(){
        System.out.println(x+","+y);
    }

    public String toString(){
        return x+","+y;
    }
}
