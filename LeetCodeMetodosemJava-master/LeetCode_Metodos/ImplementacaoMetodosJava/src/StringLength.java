public class StringLength {
    public static void main(String[] args) {
        String s = "Gabriel";
        int resultado = StringLength(s);
        System.out.println(resultado);
    }
    public static int StringLength(String palavra) {
        int count = 0;
        String []palavraSeparada = palavra.split("");
        for (String x : palavraSeparada){
            count++;
        }
        return count;
    }
}
