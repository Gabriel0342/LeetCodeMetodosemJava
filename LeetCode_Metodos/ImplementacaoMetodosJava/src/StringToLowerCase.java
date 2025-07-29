public class StringToLowerCase {
    public static void main(String[] args) {
        String name = "Carlos";
        String a = ToLowerCase(name);
        System.out.println(a);
    }
    public static String ToLowerCase(String string) {
        String stringFinal = "";
        char caracterNovo = ' ';
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                caracterNovo =(char)(string.charAt(i) + 32);
            }else{
                caracterNovo = string.charAt(i);
            }
            stringFinal += caracterNovo;
        }
        return stringFinal;
    }
}
