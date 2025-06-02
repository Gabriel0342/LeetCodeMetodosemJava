import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;

public class Power_of_Two {
    public static void main(String[] args) {
        int numero = 0;
        boolean existe = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um numero:");
        numero = sc.nextInt();

        existe = Verifica(numero);

        System.out.println(existe);
    }
    public static boolean Verifica(int numero) {
        boolean existe = false;
        int i = 0;
        while(true) {
            int valor = (int) pow(2, i);
            if (valor == numero) {
                existe = true;
                break;
            }
            if(numero < i){
                break;
            }
            i++;
        }
        return existe;
    }
}
