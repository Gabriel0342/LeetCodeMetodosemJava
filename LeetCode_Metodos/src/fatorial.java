import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        int valor = 0;

        for (int i = 1; i <= n; i++) {
            valor = fatorial(n);
        }
        if(valor == n){
            System.out.print("0 não é válido");
        }
        else{
            System.out.print(valor);
        }
    }
    public static int fatorial(int n) {
        if(n == 1){
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return n * fatorial(n-1);
        }
    }
}
