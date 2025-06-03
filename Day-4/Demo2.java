

public class Demo2 {
    public static void main(String[] args) 
    {
        int n=5;
        for(int row = 1; row <=n; row++){
            for(int col = n; col>=row ;col--){
                System.out.print(row+ " ");
            }
            System.out.println();
        }
    }
    
}
/*
 
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
 */