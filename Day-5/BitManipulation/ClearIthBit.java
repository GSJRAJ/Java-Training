public class ClearIthBit {
    public static void main(String[] args) {
        int n = 8, pos = 3;
        int mask = ~(1<<pos);
        n = n&mask;
        System.out.println(n);
    }
    
}
