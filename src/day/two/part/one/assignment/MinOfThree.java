    package day.two.part.one.assignment;

    public class MinOfThree {
        public static void main(String[] args) {
            int a=3;
            int b=1;
            int c=8;
            if(a<b){
                if(a<c){
                    System.out.println(a);
                }else {
                    System.out.println(c);
                }
            }else{
                if(b<c){
                    System.out.println(b);
                }else {
                    System.out.println(c);
                }
            }
        }
    }
