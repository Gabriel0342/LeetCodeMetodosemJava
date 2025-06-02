public class Three_Divisors {
    public static void main(String[] args) {
        int x = 12;
        boolean u = threeDivisors(x);
        System.out.println(u);
    }
    public static boolean threeDivisors(int n) {
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j++;
            }
        }
        if(j == 3){
            return true;
        }else {
            return false;
        }
    }
}
