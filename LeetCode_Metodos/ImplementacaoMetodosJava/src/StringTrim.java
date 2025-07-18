public class StringTrim {
    public static void main(String[] args) {
        String s1 = "  Hello World  ";
        String stringFinal = stringTrim(s1);
        System.out.println(s1);
        System.out.println(stringFinal);
    }
    public static String stringTrim(String str) {
        String nova = "";
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != ' ' && str.charAt(i-1) == ' '){
                nova = nova + str.charAt(i);
            }
            if(str.charAt(i) != ' ' && str.charAt(i-1) != ' '){
                nova = nova + str.charAt(i);
            } else if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
                nova = nova + str.charAt(i);
            }
        }
        return nova;
    }
}
