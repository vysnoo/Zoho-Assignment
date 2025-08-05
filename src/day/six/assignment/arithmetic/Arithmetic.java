package day.six.assignment.arithmetic;

public class Arithmetic {

    public int add(int x, int y){
        return x+y;
    }
    public int subtract(int x, int y){
        return x-y;
    }
    public int multiply(int x, int y){
        return x*y;
    }
    public double  divide(int x, int y){
        if(y!=0){
            return (double) x/y;
        }
       return -1;
    }
    public int modulo(int x, int y){
        return x%y;
    }
}
