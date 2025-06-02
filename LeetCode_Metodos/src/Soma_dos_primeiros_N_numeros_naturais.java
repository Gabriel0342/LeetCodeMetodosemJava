import java.util.Scanner;

public class Soma_dos_primeiros_N_numeros_naturais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.print("Somas os n primeiros numeros naturais (escreva valor de n): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            soma = soma_dos_primeiros_N_numeros_naturais(i);
        }
        System.out.print(soma);
    }
    public static int soma_dos_primeiros_N_numeros_naturais(int n) {
        if(n == 0){
            return 0;
        }
        else{
           return n+soma_dos_primeiros_N_numeros_naturais(n-1);
        }
    }
}
