public class Demo3 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 5; row>=1; row--){
            for(int col=1;col<=n-row+1; col++){
                System.out.print(row+ " ");
            }System.out.println();
        }
    }
    
}
/*
5 
4 4
3 3 3
2 2 2 2
1 1 1 1 1
 */
