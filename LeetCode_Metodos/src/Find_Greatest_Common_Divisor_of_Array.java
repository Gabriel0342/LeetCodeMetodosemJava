import java.util.ArrayList;
import java.util.Scanner;

public class Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args) {
        int []num = {2,5,6,9,10};
        int n = findGreatestCommonDivisor(num);
        System.out.println(n);
    }
    public static int findGreatestCommonDivisor(int[]num) {
        int max = 0;
        int min = 2147483647;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > max){
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(max+" "+min);
        int valor = 0;
        for (int i = 1; i <= max; i++) {
            if(max % i == 0 && min % i == 0){
                valor = i;
            }
        }
        return valor;
    }
}
