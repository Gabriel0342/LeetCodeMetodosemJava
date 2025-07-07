public class StringUpperCase {
    public static void main(String[] args) {
        String palavra = "Gabriel Saraiva da Silva";
        System.out.println(upperCase(palavra));
    }
    public static String upperCase(String palavra) {
        String palavraFinal = "";
        String[] palavras = palavra.split("");
        for (int i = 0; i < palavras.length; i++) {
            char caracter = palavras[i].charAt(0);
            int valorAscii = caracter;

            if(valorAscii >= 65 && valorAscii <= 90) {
                palavraFinal += caracter;
            }else if(valorAscii >= 97 && valorAscii <= 122) {
                palavraFinal += (char)(caracter - 32);
            }else if(valorAscii < 65) {
                palavraFinal += caracter;
            }
        }
        return palavraFinal;
    }
}
