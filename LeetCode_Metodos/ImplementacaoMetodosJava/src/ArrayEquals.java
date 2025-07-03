import java.util.Random;

public class ArrayEquals {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[5000];
        int [] array2 = new int[5000];

        for (int i = 0; i < 5000; i++) {
            array[i] = array2[i] = random.nextInt();
        }


        System.out.println(arrayEquals(array,array2));
    }
    public static boolean arrayEquals(Object valor1, Object valor2) {
        String resultado = ArrayMistch.mismatch(valor1,valor2);
        return resultado == null;
    }
}
