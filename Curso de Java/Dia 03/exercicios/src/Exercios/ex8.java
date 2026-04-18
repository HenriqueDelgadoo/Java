package Exercios;
import java.util.*;

public class ex8 {
    public static void main (String []args){
        Queue <Integer> numeros = new LinkedList<>();
        // Só para criar a lista com numeros
        for (int i = 1; i < 100; i++) {
            numeros.add(i);
        }
        // verifica cada numero da lista se ele é impar e se for remove

        numeros.removeIf(i-> i%2 !=0);
        numeros.removeIf(i -> i%15 == 0);
        System.out.println(numeros);
    }
}
