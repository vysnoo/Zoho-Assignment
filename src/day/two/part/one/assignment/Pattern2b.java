package day.two.part.one.assignment;

public class Pattern2b {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<=n;row++){
            for(int col=1;col<=n-1;col++){
                if(row==1 || row==3){
                    System.out.print("R");
                }
                if(row==2 || row==5){
                    if(col==1 || col==n-1){
                        System.out.print("R");
                    }else {
                        System.out.print(" ");
                    }
                }
                if(row==4){
                    if(col==1 || col==n-2){
                        System.out.print("R");
                    }else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
