package day.four.assignment;

public class ThreeD extends TwoD {
    private int z;

    ThreeD(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    public ThreeD() {
        super();
    }

    void setZ(int z){
        this.z=z;
    }

    int getZ(){
        return this.z;
    }

    public double distance(ThreeD other){
        double dx = other.getX() - this.x;
        double dy = other.getY() - this.y;
        double dz = other.getZ() - this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
