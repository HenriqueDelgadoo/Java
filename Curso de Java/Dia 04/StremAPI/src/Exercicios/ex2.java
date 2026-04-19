package Exercicios;

import java.util.*;
public class ex2 {
    public static void main (String []args){
    List <String> linguagens = new ArrayList<>();
    linguagens.add("Java");
    linguagens.add("python");
    linguagens.add("c++");
    linguagens.add("JavaScript");

    linguagens.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
