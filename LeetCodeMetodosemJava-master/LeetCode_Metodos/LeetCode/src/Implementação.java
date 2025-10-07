public class Implementação {
    public static void main(String[] args) {
        int []digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int []resultado = Metodos.plusOne(digits);
        for (int i : resultado){
            System.out.println(i);
        }
    }
}
