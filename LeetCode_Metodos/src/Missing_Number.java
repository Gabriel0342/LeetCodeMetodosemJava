import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int []numeros = {0,1,2};
        int resultado = missing_number(numeros);
        System.out.println(resultado);
    }
    public static int missing_number(int[] nums) {
        int tamanho = nums.length;
        int []valores = new int[tamanho + 1];
        for (int i = 0; i <= tamanho; i++) {
            valores[i] = i;
        }
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if(nums[i] > nums[j]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        int valorFalta = 0;
        valorFalta = Arrays.mismatch(valores,nums); // calcula qual o valor diferente entre dois arrays
        return valorFalta;
    }
}
