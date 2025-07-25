package day.two.part.one.assignment;

public class Pattern2a {
    public static void main(String[] args) {
        int n=5;
        int temp=n;
        for(int row=1;row<=n;row++){
            int spaceCond=row<=(n/2)+1?row-1:n-row;
            for(int space=1;space<=spaceCond;space++){
                System.out.print(" ");
            }
            int colCond=temp;
            for (int col=1;col<=colCond;col++){
                if(col==1 || col==colCond){
                    System.out.print(1);
                }else{
                    System.out.print(" ");
                }

            }
            if(row < (n/2)+1) {
                temp = temp - 2;
            }else{
                temp=temp+2;
            }
            System.out.println();
        }

    }
}
