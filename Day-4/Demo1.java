public class Demo1 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<n;row++){
            for(int space =0; space<n-row; space++){
                System.out.print(" ");
            }for(int col =0; col<n;col++){

                System.out.println("*");
            }

        }System.out.println();
    }    
}
