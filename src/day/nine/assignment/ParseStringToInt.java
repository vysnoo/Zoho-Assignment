package day.nine.assignment;

public class ParseStringToInt {
    public static void main(String[] args) {
        try {
            System.out.println(stringToInt("13r"));
        } catch (Exception e) {
            System.out.println("Invalid String");
        }

    }
    public static int stringToInt(String s) throws Exception{
        return Integer.parseInt(s);
    }
}
