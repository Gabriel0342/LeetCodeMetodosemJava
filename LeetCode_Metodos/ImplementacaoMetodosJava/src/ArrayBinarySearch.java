public class ArrayBinarySearch {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9};
        int valor = 9;
        System.out.printf(String.valueOf(arrayBinarySearch(array,valor)));

    }
    public static int arrayBinarySearch(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return 0;
    }
}
