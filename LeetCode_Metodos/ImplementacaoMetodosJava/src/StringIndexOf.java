public class StringIndexOf {
    public static void main(String[] args) {
        String name = "Carla";
        int encontrar = indexOf("Car",name);
        System.out.println(encontrar);
    }
    public static int indexOf(String caracter, String string) {
        String  []palavra = string.split("");
        for (int i = 0; i < string.length(); i++) {
            if(palavra[i].equals(caracter)) {
                return i;
            }
        }
        return -1;
    }
}
