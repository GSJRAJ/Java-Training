public class DemoSquare {
    public static void main(String[] args) {
        int n =5;
        
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print(col+" ");
             }
                for(int col=1;col<=row;col++)
                {
                    
                
                System.out.print(col+" ");
                }System.out.println();
            }
            
        }
    }

/*
1 2 3 4 5 
2 3 4 5 2
3 4 5 2 3
4 5 2 3 4
5 2 3 4 1
 */