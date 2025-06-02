import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class ArrayMistch {

    public static void main(String[] args) {
        char valor1 = '0';
        char valor2 = '1';

        String resultado = mismatch (valor1,valor2);
        System.out.println(resultado);
    }
    public static String mismatch (Object valores1, Object valores2) {
        try {
            long tempoInicial = System.currentTimeMillis();
            int tamanho1 = Array.getLength(valores1);
            int tamanho2 = Array.getLength(valores2);
            int x = 0;

            if (tamanho1 > tamanho2) {
                x = tamanho2;
                return String.valueOf(x);
            } else if (tamanho2 > tamanho1) {
                x = tamanho1;
                return String.valueOf(x);
            } else {
                x = tamanho1;
            }

            for (int i = 0; i < x; i++) {
                Object valores1F = Array.get(valores1, i);
                Object valores2F = Array.get(valores2, i);

                if (!Objects.equals(valores1F, valores2F)) {
                    long tempoFinal = System.currentTimeMillis();
                    long tempoDeExecucao = tempoFinal - tempoInicial;
                    System.out.println("Demorou " + tempoDeExecucao + " milisegundos");
                    return String.valueOf(i);
                }
            }
            return null;
        }catch (Exception e) {
            return e.getMessage();
        }
    }
}
