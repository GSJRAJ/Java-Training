import java.util.Scanner;
public class Demo {
    public static void main(String args[]){
        int n = 5;
    //    for left part
        for(int row=1;row<n*2;row++){
            int totalcol=(row>n)?2*n-row:row;
            for(int col=1;col<=totalcol;col++){
                System.out.print("*");
            }
            for(int space=1;)
            System.out.println();

        }
    }
}