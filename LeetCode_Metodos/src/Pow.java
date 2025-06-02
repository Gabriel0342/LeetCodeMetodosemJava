import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultado = 0;

        int numero = 0;
        System.out.print("Introduz um numero: ");
        numero = input.nextInt();

        int elevador = 0;
        System.out.print("Introduza a que número deseja elevar "+ numero +": ");
        elevador = input.nextInt();

        if(elevador == 0){
            resultado = 1;
        }else{
            resultado = pow(numero,elevador);
        }
        System.out.print("Resultado: "+resultado);
    }

    public static int pow(int numero, int elevador) {
        int resultado = 1;
        for (int i = 1; i <= elevador; i++) {
            resultado = resultado * numero;
        }
        return resultado;
    }
}
