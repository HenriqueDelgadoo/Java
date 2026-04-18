package Exercios;
import java.util.*;

public class ex4 {
    public static void main (String []args){
        List<Integer> duplicadas = new ArrayList<>();
        duplicadas.add(1);
        duplicadas.add(2);
        duplicadas.add(2);
        duplicadas.add(3);
        duplicadas.add(4);
        duplicadas.add(4);
        duplicadas.add(5);

        Set<Integer> semDuplicatas = new LinkedHashSet<>(duplicadas); // esse linkedHashSet já remove as duplicatas da lista sem precisar de for
        // Além de manter na ordem da lista

      /*  for (int i : duplicadas) {
            semDuplicatas.add(i);
        }*/

        System.out.println("Lista sem duplicatas : " + semDuplicatas);
    }
}
