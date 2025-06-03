public class Demo6 {

     public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int row=1; row<=n;row++){
            k=row;
            
            for(int col=1; col<=row;col++){
                int current = row*col;
                System.out.print(current+" ");
                
            }System.out.println();
        }
    }
}
/*
public class Demo6{
public static void main(String args[]){
int n = 7;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++)
{
System.out.print(i*j+" ");
}System.out.println();
}
}
}
*/
/* 
1 
2 4
3 6 9
4 8 12 16
5 10 15 20 25
 */
