package Exercicios;

import java.util.*;

public class ex1 {

    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        List<Integer> impares = numeros.stream()
                .filter(n -> n % 2 == 1)
                .map(n->(n*n))
                .toList();
        System.out.println(impares);

    }
}
