public class Climbing_Stairs {
    public static void main(String[] args) {
        int x = 4;
        int r = climbStairs(x);
        System.out.println(r);
    }
    public static int climbStairs(int n) {
        int res = 0;
        int x1 = 0, x2 = 0;
        for (int i = 0; i <= n; i++) {
            if(i == 0){
                x1 = 1;
            }
            res = x1 + x2;
            x1 = x2;
            x2 = res;
        }
        return res;
    }
}
