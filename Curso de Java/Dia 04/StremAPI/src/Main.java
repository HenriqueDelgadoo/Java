//Stream API =>  realizar operações funcionais nas nossa collections (estrutura de dados)
// filter, map, reduce, collect, forEach, etc.
//filter => filtrar os elementos de uma coleção com base em uma condição
//map => transformar os elementos de uma coleção em outro tipo de elemento
//reduce => reduzir os elementos de uma coleção a um único valor
//collect => coletar os elementos de uma coleção em outra coleção
//agregações => operações que reduzem uma coleção a um único valor, como soma, média, contagem, etc.

import java.util.*;
public class Main{

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "ABC-1234");
        Carro carro2 = new Carro("Honda", "Civic", 2019, "DEF-5678");

        System.out.println(carro1.modelo());
        System.out.println(carro2.placa());

        List<Integer> lista  =  new ArrayList<>();

        for ( int i = 0; i<=100; i++) {
            lista.add(i);
        }
        List<Integer> pares = lista
                .stream() // transforma em um stream
                .filter(n->n%2 == 0) // caputara os elementos que satisfazem essa condição, nesse caso os números pares
                .map(n->n*2) // transforma os elementos do stream, nesse caso multiplicando por 2
                .toList(); //retronsforma as informações em uma lista
        System.out.println(pares);
    }
}