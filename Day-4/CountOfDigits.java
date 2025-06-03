import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = 0;
        if(a%2==0){
            System.out.println(" "+b);
        }else{
            b=b+1;
            a=a/10;


        }
        
            }
    
}
/* Brute Force Approach
int n = 1234;
int cnt = 0;
while (n!=0){
     n = n / 10;
     cnt++;
}System.out.println(cnt);
}
*/

/* using logarithms we do this to achieve optimisation
 System.out.println((int)Math.log10(n)+1);
 */