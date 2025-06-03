public class ClearLastIthBit {
    public static void main(String[] args) {
        int n = 15, pos = 2;
        int mask = (-1<<pos);
        n=n&mask;
        System.out.println(n);
    }
}
