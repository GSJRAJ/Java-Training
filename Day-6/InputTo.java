import java.util.Scanner;
import java.util.Arrays;

public class InputTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i ++){
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(array));
        int sum=0;
        for(int val:array)
        {
            if(val%2==0)
            {
                sum+=val;
                System.out.println(val+" ");
            }
        }System.out.println("the sum of even no" + sum);
    }
}