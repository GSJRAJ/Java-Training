public class DemoK {
    public static void main(String[] args) {
        for (int row = 0; row<5; row++){
            for (int col = 0; col<3; col++){
                if(col==0||row+col==2||row-col==2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
