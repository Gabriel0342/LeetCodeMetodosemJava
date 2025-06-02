import static java.lang.Math.pow;

public class PowerofTwo {
    public static void main(String[] args) {
        int x = 2147483646;
        boolean isPowerOfTwo = powerOfTwo(x);
        System.out.println(isPowerOfTwo);
    }
    public static boolean powerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0; //quando o resultado é maior que zero e o AND com o numero anterior é 0 retorn 1 (verdadeiro), 0(falso)
    }
}
