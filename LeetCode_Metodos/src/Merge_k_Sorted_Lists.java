import java.util.*;

public class Merge_k_Sorted_Lists {
    public static void Merge(List lista) {
        Collections.sort(lista);
        System.out.print(lista);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        List<Integer> lista3 = new ArrayList<Integer>();

        List<Integer> listaFinal = new ArrayList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(5);

        lista2.add(1);
        lista2.add(3);
        lista2.add(4);

        lista3.add(2);
        lista3.add(6);

        listaFinal.addAll(lista1);
        listaFinal.addAll(lista2);
        listaFinal.addAll(lista3);

        Merge(listaFinal);
    }
}
