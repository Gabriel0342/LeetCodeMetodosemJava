public class StringCointains {
    public static void main(String[] args) {
        String nome = "Gabriel";
        boolean veredito = stringCointains(nome,"bri");
        System.out.println(veredito);
    }

    /**
     *
     * @param palavra vai colocar a palavra a analisar
     * @param sub recebe o trecho a analisar
     * @return se é verdadeiro ou falso para se o trecho pertence ou não a palavra
     */
    public static boolean stringCointains(String palavra,String sub) {
        for (int i = 0; i <= StringLength.StringLength(palavra) - StringLength.StringLength(sub); i++) {
            if(StringSubString.Stringsubstring(palavra, i, i+StringLength.StringLength(sub)).equals(sub)){
                return true;
            }
        }
        return false;
    }
}
