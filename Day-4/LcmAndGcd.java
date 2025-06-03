public class LcmAndGcd {
    public static void main(String[] args) {
        int a=4;
        int b=9;
        int mul=a*b;
        while(b!=0);
        {
            int t =b;
            b=a%b;
            a=t;
        }
        System.out.println(a);
        System.out.println("lcm:" +mul/a);
    }
}
