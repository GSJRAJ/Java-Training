public class Demo8 {
    public static void main(String[] args) {
        int n =5;
        for(int row=1; row<=n; row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){

                System.out.print(col+" ");
            }
System.out.println();
        for(int col=2; col<=row;col++)

    
{
    System.out.print(col+"");
}
    }
}
}