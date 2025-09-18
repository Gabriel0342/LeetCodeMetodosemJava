public class MathAbs {
    public static void main(String[] args) {
        int x = 0;
        int res = Mathabs(x);
        System.out.println(res);
    }
    public static int Mathabs(int x) {
        if(x < 0){
            return x * (-1);
        }
        else {
            return x;
        }
    }
}
