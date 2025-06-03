public class DemoY {
         
    public static void main(String[] args) {
        for (int row = 0; row<7; row++){
            for (int col = 0; col<=7; col++){
                if(col==row && row<4 || row>2 && col==3  || row + col == 6 && row<4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
        } }
    
    

