public class DemoW {
         
    public static void main(String[] args) {
        for (int row = 0; row<4; row++){
            for (int col = 0; col<=6; col++){
                if(col+row==3|| col == 0 || col == 6 || row - col == -3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
        } }
    

