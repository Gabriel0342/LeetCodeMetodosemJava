import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int valorFinal = 0;
        System.out.print("Quantidade de valor para a sequência de fibonacci: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            valorFinal = fibonacci(i);
        }
        System.out.print(valorFinal);
    }
    public static int fibonacci(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
