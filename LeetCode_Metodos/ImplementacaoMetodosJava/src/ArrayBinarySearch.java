public class ArrayBinarySearch {
    public static void main(String[] args) {
        int []array = new int [1000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int valor = 999999;
        System.out.printf(String.valueOf(arrayBinarySearch(array,valor)));

    }

    /**
     *
     * @param array vai servir para que a função receba o array a analisar
     * @param valor vai servir para que, possamos saber qual o valor que queremos procurar
     * @return o valor de i que vai ser o indice onde o está o valor no array e se não for encontrado, ele retonará -1 o que sinaliza que ele nao está no array
     */
    public static int arrayBinarySearch(int[] array, int valor) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                long tempoFinal = System.currentTimeMillis();
                long tempoDeExecucao = tempoFinal - tempoInicial;
                System.out.println("Demorou " + tempoDeExecucao + " milisegundos");
                return i;
            }
        }
        return -1;
    }
}
