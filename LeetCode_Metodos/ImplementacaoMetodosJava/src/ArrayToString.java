import java.awt.*;
import java.util.Random;

public class ArrayToString {
    public static void main(String[] args) {
        Random random = new Random();
        String[] teste = new String[5000];

        for (int i = 0; i < 5000; i++) {
            teste[i] = String.valueOf(i);
        }
        ToString(teste);
    }
    public static void ToString(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
    }
}
