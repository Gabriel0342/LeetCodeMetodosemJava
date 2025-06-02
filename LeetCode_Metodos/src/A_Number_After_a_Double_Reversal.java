public class A_Number_After_a_Double_Reversal {
    public static void main(String[] args) {
        int x = 609576;
        boolean r = reverse(x);
        System.out.println(r);
    }
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
}
