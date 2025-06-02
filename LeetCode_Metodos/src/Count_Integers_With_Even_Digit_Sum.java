public class Count_Integers_With_Even_Digit_Sum {
    public static void main(String[] args) {
        int num = 4;
        int x = count_Integers_With_Even_Digit_Sum(num);
        System.out.println(x);
    }
    public static int count_Integers_With_Even_Digit_Sum(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(somaDigitosPar(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean somaDigitosPar(int num) {
        String numero = String.valueOf(num);
        int tamanho = numero.length();
        int[]valores = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            valores[i] = num % 10;
            num = num / 10;
        }
        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += valores[i];
        }
        if(soma % 2 == 0) {
            return true;
        }
        return false;
    }
}
