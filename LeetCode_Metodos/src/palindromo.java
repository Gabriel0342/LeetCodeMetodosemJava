public class palindromo {
    public static void main(String[] args) {
        int x = 121;
        boolean a = palindromo(x);
        System.out.println(a);
    }
    public static boolean palindromo(int x) {
        int numero = x;
        int y = 0;
        int valorInvertido = 0;

        while(x > 0){
            y = x % 10;
            valorInvertido = valorInvertido * 10 + y;
            x = x / 10;
        }
        if(numero == valorInvertido){
            return true;
        }
        else {
            return false;
        }
    }
}
