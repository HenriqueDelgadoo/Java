package Exercios;
import java.util.*;

public class ex9 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Digite números (0 para sair): ");

        while (true) {
            int numeros = sc.nextInt();
            if (numeros == 0) break;
            lista.add(numeros);
        }

        // O Map agora guardará o número e a quantidade de vezes que ele aparece
        Map<Integer, Integer> contagemMap = new HashMap<>();

        for (int i : lista) {
            // Pega o valor atual (ou 0) e soma 1
            int total = contagemMap.getOrDefault(i, 0) + 1;
            contagemMap.put(i, total);
        }

        System.out.println("\nResultado:");
        for (Map.Entry<Integer, Integer> entry : contagemMap.entrySet()) {
            System.out.println(entry.getKey() + " -> apareceu " + entry.getValue() + " vez(es)");
        }
    }
}
