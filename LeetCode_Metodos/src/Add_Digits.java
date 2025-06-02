public class Add_Digits {
    public static void main(String[] args) {
        int x = 0;
        int res = addDigits(x);
        System.out.println(res);
    }
    public static int addDigits(int num) {
        String numero = String.valueOf(num);
        int tamanho = numero.length();

        int []valores = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int n = num % 10;
            num = num / 10;
            valores[i] = n;
        }

        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += valores[i];
        }
        String res = String.valueOf(soma);
        int t = res.length();
        int []valorFinais = new int[t];

        if(soma < 100){
            for (int i = 0; i < t; i++) {
                int n = soma % 10;
                soma = soma / 10;
                valorFinais[i] = n;
            }
            for (int i = 0; i < t; i++) {
                soma += valorFinais[i];
            }
            if(soma > 9){
                String r = String.valueOf(soma);
                int v = r.length();
                int []valoresFinais = new int[v];

                for (int i = 0; i < v; i++) {
                    int n = soma % 10;
                    soma = soma / 10;
                    valoresFinais[i] = n;
                }
                for (int i = 0; i < v; i++) {
                    soma += valoresFinais[i];
                }
            }
        }
        return soma;
    }
}
