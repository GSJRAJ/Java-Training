public class Demo5 {
     public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int row=1; row<=n;row++){
            k=k+(row-1);
            int current=k+row-1;
            for(int col=1; col<=row;col++){
                System.out.print(current--+" ");
                
            }System.out.println();
        }
    }
}
/*
1 
3 2
6 5 4
10 9 8 7
15 14 13 12 11
 */