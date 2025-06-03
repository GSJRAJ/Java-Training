public class GetIthbit {
    public static void main(String[] args) {
        int n = 4, pos = 2;
        int mask = 1<<pos;
        int bit = n&mask;
        System.out.println((bit==0)?0:1);
    }
    
}
