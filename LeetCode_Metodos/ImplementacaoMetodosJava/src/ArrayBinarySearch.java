public class ArrayBinarySearch {
    public static void main(String[] args) {
        int []array = new int [1000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int valor = 999999;
        System.out.printf(String.valueOf(arrayBinarySearch(array,valor)));

    }
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
        return 0;
    }
}
