import java.util.Arrays;

public class ArraycopyOf {
    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        Object [] array = new Object[5000];

        for(int i = 0; i < 5000; i++){
            array[i] = i;
        }
        long tempoFinal = System.currentTimeMillis();
        long tempoDeExecucao = tempoFinal - tempoInicial;
        Object [] array2 = ArraycopyOf(array, array.length);
        System.out.println(Arrays.toString(array2));
        System.out.println("Demorou " + tempoDeExecucao + " milisegundos");
    }

    /**
     *
     * @param array  recebe um array do tipo Object para ser copiado para outro array do mesmo tipo
     * @param tamanho informa o tamanho do array que será copiado para, este ser usado num for
     * @return o array copiado
     */
    public static Object[] ArraycopyOf(Object [] array, int tamanho){
        Object [] ArrayCopiado = new Object[tamanho];
        for(int i = 0; i < tamanho; i++){
            ArrayCopiado[i] = array[i];
        }
        return ArrayCopiado;
    }
}