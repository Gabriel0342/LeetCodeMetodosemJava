public class Happy_Number {
    public static void main(String[] args) {
        int x = 19;
        boolean isHappy = happyNumber(x);
        System.out.println(isHappy);
    }

    public static boolean happyNumber(int n) {
        int soma;
        int somaFinal = n;

        int contador = 0;

        while (somaFinal != 1 && contador < 100) {
            String valor = Integer.toString(somaFinal);
            int tamanho = valor.length();
            int[] valores = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                valores[i] = valor.charAt(i) - '0';
            }

            soma = 0;
            for (int i = 0; i < tamanho; i++) {
                soma = soma + (valores[i] * valores[i]);
            }
            somaFinal = soma;
            contador++;
        }
        if (somaFinal == 1) {
            return true;
        } else {
            return false;
        }
    }
}
