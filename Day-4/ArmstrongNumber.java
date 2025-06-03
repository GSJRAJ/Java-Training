import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int original= a;
        int sum=0;

        while(a>0){
            int digit = a%10;
            sum += (int)Math.pow(digit,3);
            a=a/10;

        }
        if(sum== original){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
        
    
}
}
