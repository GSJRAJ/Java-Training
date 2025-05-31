public class SetIthBit {
    public static void main(String[] args) {
        int n=12, pos =4;
        int mask = 1<<pos;
        n=n|mask;
        System.out.println(n);
        
    }
    
}
