import java.util.*;

public class Metodos {
    public static boolean reverse(int number) {
        String r = String.valueOf(number);
        int tamanho = r.length();

        int somaFinal1 = 0;

        int []valores = new int[tamanho];

        for (int i = tamanho - 1; i >= 0; i--) {
            if(r.charAt(i) != '0'){
                valores[i] = Integer.parseInt(r.charAt(i) + "");
            }
        }
        int indice = 0;
        for (int v : valores) {
            if(v == 0) {
                if (indice + 1 < valores.length && ((valores[indice + 1] == 0 && (valores[indice - 1] != 0)) || ((valores[indice - 1] == 0 && valores[indice + 1] != 0)) || (valores[indice - 1] != 0 && valores[indice + 1] != 0))) {
                    somaFinal1 = somaFinal1 * 10 + v;
                }
            }else {
                somaFinal1 = somaFinal1 * 10 + v;
            }
            indice++;
        }
        if(somaFinal1 == number) {
            return true;
        }
        return false;
    }
    public static int addBinary(int a, int b) {
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);

        int maxLength = Math.max(a1.length(), b1.length());
        int[] listaA = new int[maxLength];
        int[] listaB = new int[maxLength];
        int[] resultado = new int[maxLength + 1];

        // Fill arrays from the end
        for (int i = 0; i < a1.length(); i++) {
            listaA[maxLength - 1 - i] = a1.charAt(a1.length() - 1 - i) - '0';
        }

        for (int i = 0; i < b1.length(); i++) {
            listaB[maxLength - 1 - i] = b1.charAt(b1.length() - 1 - i) - '0';
        }

        int transporte = 0;
        for (int k = maxLength - 1; k >= 0; k--) {
            int soma = listaA[k] + listaB[k] + transporte;
            if (soma == 2) {
                transporte = 1;
                soma = 0;
            } else if (soma == 3) {
                transporte = 1;
                soma = 1;
            } else {
                transporte = 0;
            }
            resultado[k + 1] = soma;
        }

        if (transporte == 1) {
            resultado[0] = 1;
        }

        int result = 0;
        for (int i = 0; i < resultado.length; i++) {
            result = result * 10 + resultado[i];
        }

        return result;
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
    public static int climbStairs(int n) {
        int res = 0;
        int x1 = 0, x2 = 0;
        for (int i = 0; i <= n; i++) {
            if(i == 0){
                x1 = 1;
            }
            res = x1 + x2;
            x1 = x2;
            x2 = res;
        }
        return res;
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
    public static int countZeros(int num1,int num2) {
        int cout = 0;
        while (num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
                if(num2 == 0) {
                    return cout;
                }
            }
            else {
                num2 = num2 - num1;
                if(num1 == 0) {
                    return cout;
                }
            }
            cout++;
        }
        if(num1 != 0 && num2 != 0) {
            return cout + 1;
        }else {
            return cout;
        }
    }
    public static int fibonacci(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
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
        int valor = 0;
        for (int i = 1; i <= max; i++) {
            if(max % i == 0 && min % i == 0){
                valor = i;
            }
        }
        return valor;
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
    public static void Merge(List lista) {
        Collections.sort(lista);
        System.out.print(lista);
    }
    public static int fatorial(int n) {
        if(n == 1){
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return n * fatorial(n-1);
        }
    }
    public static int missing_number(int[] nums) {
        int tamanho = nums.length;
        int []valores = new int[tamanho + 1];
        for (int i = 0; i <= tamanho; i++) {
            valores[i] = i;
        }
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if(nums[i] > nums[j]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        int valorFalta = 0;
        valorFalta = Arrays.mismatch(valores,nums); // calcula qual o valor diferente entre dois arrays
        return valorFalta;
    }
    public static boolean palindromo(int x) {
        int numero = x;
        int y = 0;
        int valorInvertido = 0;

        while(x > 0){
            y = x % 10;
            valorInvertido = valorInvertido * 10 + y;
            x = x / 10;
        }
        if(numero == valorInvertido){
            return true;
        }
        else {
            return false;
        }
    }
    public static int potencia(int num,int expoente) {
        if(expoente == 0){
            return 1;
        }
        else {
            return num * potencia(num,expoente-1);
        }
    }
    public static int pow(int numero, int elevador) {
        int resultado = 1;
        for (int i = 1; i <= elevador; i++) {
            resultado = resultado * numero;
        }
        return resultado;
    }
    public static boolean powerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0; //quando o resultado é maior que zero e o AND com o numero anterior é 0 retorn 1 (verdadeiro), 0(falso)
    }
    public static void valorRemove(int valorRemove, ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == valorRemove) {
                list.remove(i);
            }
        }
        System.out.print(list);
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
    public static int soma_dos_primeiros_N_numeros_naturais(int n) {
        if(n == 0){
            return 0;
        }
        else{
            return n+soma_dos_primeiros_N_numeros_naturais(n-1);
        }
    }
    public static int sqrt(int x) {
        for(int i = 1; i <= x; i++){
            if(pow(i,2) == x){
                return i;
            } else if (pow(i,2) >= x) {
                return i-1;
            }
        }
        return 0;
    }
    public static boolean threeDivisors(int n) {
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j++;
            }
        }
        if(j == 3){
            return true;
        }else {
            return false;
        }
    }
    public static boolean uglyNumber(int n) {
        if(n == 0){
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        if(n == 1) {
            return true;
        }
        return false;
    }
}
