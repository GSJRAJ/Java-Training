public class Demo7 {
    public static void main(String[] args) {
        int n = 6;
        
        for(int row = 1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
        
                 }
                 for(int col=row-1;col>=1;col--){
                    System.out.print(col+" ");
                 }
                 System.out.println();
        }

    }
}
/*
1 
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
 */