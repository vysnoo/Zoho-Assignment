package day.eight.assignment;

public class SingletonClassEx {

    private static final SingletonClassEx obj  = new SingletonClassEx();

    private SingletonClassEx(){
    }

    public static SingletonClassEx getInstance(){
        return obj;
    }
}

class SingletonMain{
    public static void main(String[] args) {
        SingletonClassEx obj1 = SingletonClassEx.getInstance();
        SingletonClassEx obj2 = SingletonClassEx.getInstance();
        System.out.println(obj1==obj2);
    }
}