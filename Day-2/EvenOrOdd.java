import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = a.nextInt();
        int quotient = number/2;
        int result = quotient*2;

        if(result == number){
            System.out.println("even");
        }else{System.out.println("odd");
    }


    }
}
