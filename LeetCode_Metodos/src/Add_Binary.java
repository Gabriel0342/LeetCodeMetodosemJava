import java.util.ArrayList;
import java.util.Scanner;

public class Add_Binary {
    public static void main(String[] args) {
        int a = 11, b = 1;
        int res = addBinary(a,b);
        System.out.println(res);
    }
    public static int addBinary(int a, int b) {
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);

        int maxLength = Math.max(a1.length(), b1.length());
        int[] listaA = new int[maxLength];
        int[] listaB = new int[maxLength];
        int[] resultado = new int[maxLength + 1];

        // Fill arrays from the end
        for (int i = 0; i < a1.length(); i++) {
            listaA[maxLength - 1 - i] = a1.charAt(a1.length() - 1 - i) - '0';
        }

        for (int i = 0; i < b1.length(); i++) {
            listaB[maxLength - 1 - i] = b1.charAt(b1.length() - 1 - i) - '0';
        }

        int transporte = 0;
        for (int k = maxLength - 1; k >= 0; k--) {
            int soma = listaA[k] + listaB[k] + transporte;
            if (soma == 2) {
                transporte = 1;
                soma = 0;
            } else if (soma == 3) {
                transporte = 1;
                soma = 1;
            } else {
                transporte = 0;
            }
            resultado[k + 1] = soma;
        }

        if (transporte == 1) {
            resultado[0] = 1;
        }

        int result = 0;
        for (int i = 0; i < resultado.length; i++) {
            result = result * 10 + resultado[i];
        }

        return result;
    }

}
