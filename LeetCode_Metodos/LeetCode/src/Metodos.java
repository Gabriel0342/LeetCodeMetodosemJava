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
        if (x < 2) return x;

        int valorEsq = 1, valorDrt = x, resultado = 0;

        while (valorEsq <= valorDrt) {
            int mid = valorEsq + (valorDrt - valorEsq) / 2; //calcula o meio do intervalo

            if (mid <= x / mid) { // Se mid * mid <= x, mid ainda pode ser a raiz ou está abaixo dela
                resultado = mid;
                valorEsq = mid + 1;
            } else { //Caso mid * mid > x, significa que foi longe demais
                valorDrt = mid - 1;
            }
        }

        return resultado;
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
    public static boolean ninGame(int n){
        if(n % 4 == 0){
            return false;
        }
        return true;
    }
    public static boolean isPowerOfThree(int n){
        for(int i = 0; i <= n; i++){
            if(pow(3,i) == n){
                return true;
            }
            if(pow(3,i) > n){
                break;
            }
        }
        return false;
    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static boolean isPowerOfFour(int n){
        return n > 0 && (n & (n - 1)) == 0 && (n & 0XAAAAAAAA) == 0; // verifica uma operação AND para ver se é multiplo de 2 e
        //depois verifica se tem um valor 1 em binario num indice par para poder ser um valor cujo 4^i corresponda
    }
    public static boolean isPerfectSquare(int num){
        int valor = sqrt(num);
        if(valor*valor == num){
            return true;
        }
        return false;
    }
    public static List<String> fizzBuzz(int n) {
        List<String> lista = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                lista.add("FizzBuzz");
            }else if(i % 3 == 0){
                lista.add("Fizz");
            }else if(i % 5 == 0){
                lista.add("Buzz");
            }
            else{
                lista.add(String.valueOf(i));
            }
        }

        return lista;
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder StringFinal = new StringBuilder();
        int tamanho = num2.length(), soma = 0, transporte = 0;

        if(num1.length() > num2.length()){
            tamanho = num1.length();
        }
        int i = num1.length() - 1, j = num2.length() - 1;
        while(tamanho > 0){
            int valor1 = (i >= 0) ? num1.charAt(i) - '0' : 0; // se i >=0 valor1 = num1.charAt(i) senao é valor1 = 0
            int valor2 = (j >= 0) ? num2.charAt(j) - '0' : 0; // se j >=0 valor2 = num2.charAt(i) senao é valor2 = 0

            System.out.println(valor1 +" e "+ valor2);
            soma = valor2 + valor1 + transporte;
            transporte = soma / 10;
            StringFinal.append(soma % 10);
            tamanho--;
            i--;
            j--;
        }
        if(transporte != 0){
            StringFinal.append(transporte);
        }
        return StringFinal.reverse().toString();
    }
    public static int arrangingCoins(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n >= i){
                n -= i;
                count ++;
            }else {
                break;
            }
        }
        return count;
    }
    public static int[] constructRectangle(int area){
        int []valores = new int[2];
        int altura = 1,base = 1;
        for(int i = 1; i <= area; i++){
            if(area % i ==0){
                base = i;
                altura = area / i;
            }

            if(base >= altura){
                valores[0] = base;
                valores[1] = altura;
                break;
            }
        }
        return valores;
    }
    public static String convertToBase7(int num){
        StringBuilder StringFinal = new StringBuilder();
        boolean negativo = false;

        if(num < 0){
            negativo = true;
        }

        if(num < 7 && num > -7){
            return String.valueOf(num);
        }

        if(num <= -7){
            num = num  * (-1);
        }

        while(num > 0){
            StringFinal.append(num % 7);
            num /= 7;
        }

        if(negativo){
            StringFinal.append('-');
        }

        return StringFinal.reverse().toString();
    }
    public static boolean checkPerfectNumber(int num){
        int soma = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                soma = soma + i;
            }
        }
        if(soma == num){
            return true;
        }
        return false;
    }
    public static int fib(int n){
        int valor1 = 0, valor2 = 1, valor = 0;
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        for(int i = 1; i < n; i++){
            valor = valor1 + valor2;
            valor1 = valor2;
            valor2 = valor;
        }
        return valor;
    }
    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> lista = new ArrayList<>();

        for(int i = left; i <= right; i++){
            boolean permissao = false;
            int numero = i,count = 0;
            int tamanho = String.valueOf(i).length();
            int []valores = new int[tamanho];
            int j = 0;

            while(numero > 0){ // divide o  numero
                valores[j] = numero % 10;
                j++;
                numero /= 10;
            }

            for (int k = 0; k < tamanho; k++) { // contabliza a se o numero é divisivel por todos os seus algarismos
                if(valores[k] != 0) {
                    if (i % valores[k] == 0) {
                        count++;
                    }
                }
            }
            if(count == tamanho){ // verificar se, a contablização é igual ao nª de algasrismos e, caso for ele pode ser introduzido na lista
                permissao = true;
            }
            if(permissao){
                lista.add(i);
            }
        }

        return lista;
    }
    public static String toHex(int num){
        StringBuilder StringFinal = new StringBuilder();

        int tamanho = String.valueOf(num).length();
        int valor = num,k = 0;
        boolean valido = true;

        if(num > 15){
            valido = false;
        }

        if(num < 10 && num >=0){
            StringFinal.append(num);
            return StringFinal.reverse().toString();
        }

        else if(num < 0){
            String a = String.format("%08X", num).toLowerCase(); //converte diretamente para um hexa com 32 bits
            StringFinal.append(a);
            return StringFinal.toString();
        }


        while(valor > 0){
            k = valor % 16;
            valor = valor / 16;
            if(k > 9){
                switch (k){
                    case 10:StringFinal.append('a');break;
                    case 11:StringFinal.append('b');break;
                    case 12:StringFinal.append('c');break;
                    case 13:StringFinal.append('d');break;
                    case 14:StringFinal.append('e');break;
                    case 15:StringFinal.append('f');break;
                }
                if(k >= 16){
                    int x = k - 6;
                    StringFinal.append(x);
                }
            }
            else if(k >= 0 && k <= 9 && !valido){
                StringFinal.append(k);
            }
        }
        return StringFinal.reverse().toString();
    }
    public static int countPrimeSetBits(int left, int right){
        int []valor = new int[right-left + 1];
        int count = 0, k = 0;

        for (int i = left; i <= right; i++){
            int valorBinario = Integer.bitCount(i);
            valor[k] = valorBinario;
            k++;
        }
        for (int i = 0; i < valor.length; i++) {
            boolean primo = true;
            int num = valor[i];

            if (num <= 1) {
                primo = false;
            } else {
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                count++;
            }
        }

        return count;
    }
    public static  int dayOfYear(String date){
        String[] dataSeparada = date.split("-");
        int []dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        int soma = 0;

        int ano = Integer.parseInt(dataSeparada[0]);
        int mes = Integer.parseInt(dataSeparada[1]);
        int dia = Integer.parseInt(dataSeparada[2]);

        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            System.out.println("daudb");
            dias[1] = 29;
        }

        for(int i = 0; i < mes - 1; i++){
            System.out.println(soma);
            soma = soma + dias[i];
        }
        soma = soma + dia;

        return soma;
    }
    public static int tribonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        int soma = 0;
        int valor1 = 0, valor2 = 1, valor3 = 1;

        for(int i = 1; i < n - 1; i++){
            soma = valor1 + valor2 + valor3;
            System.out.println(valor1 +"+"+valor2 +"+"+valor3+" = "+soma);
            valor1 = valor2;
            valor2 = valor3;
            valor3 = soma;
        }
        return soma;
    }
}
