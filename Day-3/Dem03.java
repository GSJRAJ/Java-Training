public class Dem03 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
/*
 5 5 5 5 5 
  4 4 4 4 
   3 3 3 
    2 2 
     1 
 */