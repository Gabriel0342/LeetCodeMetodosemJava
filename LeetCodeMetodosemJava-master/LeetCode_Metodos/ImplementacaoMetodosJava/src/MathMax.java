public class MathMax {
    public static void main(String[] args) {
        int a = -5;
        int b = -6;
        int result = max(a, b);
        System.out.println(result);
    }
    public static int max(int a, int b) {
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
