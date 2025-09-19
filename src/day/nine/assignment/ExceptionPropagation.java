package day.nine.assignment;

public class ExceptionPropagation {
    public static void main(String[] args) {
        methodOne();

    }
    static void methodOne(){
        System.out.println("Method One");
        try{
            methodTwo();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static void methodTwo() throws Exception{
        System.out.println("Method Two");
        methodThree();

    }
    static void methodThree() throws Exception{
        System.out.println("Method Three");
        throw new Exception();
    }
}
