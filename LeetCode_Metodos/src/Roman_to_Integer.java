import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Roman_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "MCMXCIV";
        int valor = romanToInt(x);
        System.out.println(valor);
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int valor = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int valor1 = map.get(s.charAt(i));
            int valor2 = map.get(s.charAt(i+1));

            if(valor1 < valor2){
                valor -= valor1;
            }else {
                valor += valor1;
            }
        }
        valor = valor + map.get(s.charAt(s.length()-1)); //soma o ultimo valor pois ele  não é somado no for
        return valor;
    }
}
