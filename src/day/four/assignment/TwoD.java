package day.four.assignment;

public class TwoD {
    protected int x;
    protected int y;

    TwoD(int x,int y){
        System.out.println("TwoD constructor with two arguments");
        this.x=x;
        this.y=y;
    }

    public TwoD() {
        System.out.println("TwoD default constructor");
    }

    void setX(int x){
       this.x=x;
    }
    void setY(int y){
        this.y=y;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
}
