import java.util.Scanner;

public class Potencia_de_um_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero,expoente;
        int resultado = 0;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        System.out.print("Digite o expoente: ");
        expoente = sc.nextInt();

        for (int i = 0; i <= expoente; i++) {
            resultado = potencia(numero,expoente);
        }
        System.out.print(resultado);
    }
    public static int potencia(int num,int expoente) {
        if(expoente == 0){
            return 1;
        }
        else {
            return num * potencia(num,expoente-1);
        }
    }
}
