import static java.lang.Math.pow;

public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        int valor = sqrt(4);
        System.out.println(valor);
    }
    public static int sqrt(int x) {
        for(int i = 1; i <= x; i++){
            if(pow(i,2) == x){
                return i;
            } else if (pow(i,2) >= x) {
                return i-1;
            }
        }
        return 0;
    }
}
