package Exercios;
import java.util.*;


public class ex1 {
    public static void main (String [] args){
        List<Integer> Numeros = new ArrayList<>(); // cria a lista com numeros inteiros 'int'
        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);

        for( int i : Numeros) {
            System.out.println(i); // imprime todos os numeros da lista;
        }

        System.out.println("Maior numero: " + Numeros.stream().max(Integer::compare).get()); // pega o maior numero da lista
        System.out.println("Menor numero: "+ Numeros.stream().min(Integer::compare).get()); // aqui ele usa o stream para encontrar o
        // menor numero da lista, usando o metodo min e passando a comparação de inteiros, e o get para pegar o valor do optional retornado

    }
}
