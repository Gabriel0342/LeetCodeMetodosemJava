import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int valor = 1,valorRemove;

        while (valor != 0) {
            System.out.print("Valores para o array: ");
            valor = sc.nextInt();
            if(valor != 0) {
                list.add(valor);
            }
        }

        System.out.print("Valores para remover: ");
        valorRemove = sc.nextInt();

        valorRemove(valorRemove,list);
    }

    private static void valorRemove(int valorRemove, ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == valorRemove) {
                list.remove(i);
            }
        }
        System.out.print(list);
    }
}
