public class StringCharAt {
    public static void main(String[] args) {
        String s = "Hello World";
        char caracter = charAt(s,1);
        System.out.println(caracter);
    }
    public static char charAt(String s, int index) {
        String []palavras = s.split("");
        char []caracteres = new char[StringLength.StringLength(s)];

        for (int i = 0; i < StringLength.StringLength(s); i++) {
            caracteres[i] = (char) palavras[i].substring(0).codePointAt(0); // extrai o caracter para o array caracteres
        }

        for (int i = 0; i < StringLength.StringLength(s); i++) {
            if(i == index){
                return caracteres[i];
            }
        }
        return ' ';
    }
}
