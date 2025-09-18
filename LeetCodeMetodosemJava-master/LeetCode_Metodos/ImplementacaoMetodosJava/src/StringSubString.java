public class StringSubString {
    public static void main(String[] args) {
        String palavra = "Gabriel";
        String resultado = Stringsubstring(palavra, 0, 1);
        System.out.println(resultado);

    }

    /**
     *
     * @param p vai dar a palavra a analisar
     * @param start é o indice por onde vamos iniciar a substring
     * @param end é o indice onde a substring termina
     * @return a substring entre os indice start e end
     */
    public static String Stringsubstring(String p,int start, int end) {
        String []palavra = p.split("");
        String substr = "";

        for(int i = start; i < end; i++) {
            substr += palavra[i];
        }
        return substr;
    }
}
