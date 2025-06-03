import java.util.Scanner;
public class PowerOf2 {
    public static boolean isPowerTwo(int n)
    { if(n==0)
        {
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        return (n==1);
        
    }
}
    

