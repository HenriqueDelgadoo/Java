package colections;

import java.util.*;


public class EstruturaDeDados {

    //map, conjuntos de dados que contem uma chave e um valor, como em java script { nome: Henrique}
    // Set, conjuntos de dados que não repetem valor, Ou seja, se tiver valor replicado não será adicionado, como em java script
    // { nome: Henrique, nome: Henrique} o segundo nome não seria adicionado
    // List, conjuntos de dados que podem conter valores repetidos, como em java script [1, 2, 3, 4, 5, 1, 2, 3]
    //queue, conjuntos de dados que seguem a regra FIFO (First In, First Out), ou seja, o primeiro elemento a entrar é o primeiro a sair
    // são importadas com java.util."nome da estrutura de dados"

    public static void main (String []args){

        //list, os valores podem ser repetidos
        List<String>  minhaLista = new ArrayList<>(); // cria um 'objeto' arrayList para armazenar os valores
        minhaLista.add("Henrique"); // adiciona os valores na lista
        minhaLista.add("Maria");
        minhaLista.add("joao");
        minhaLista.add("joao"); // Permite duplicatas

        minhaLista.getFirst(); // Pega o primeiro valor da lista, no caso "Henrique"
        System.out.println("Minha lista" + minhaLista); // Imprime a lista, que contém os valores adicionados, incluindo duplicatas

        // set
        Set<String> MeuSet = new HashSet<>(); // classe para implementar a estrutura de dados Set, que não permite valores duplicados
        MeuSet.add("Henrique");
        MeuSet.add("Reinaldo");
        MeuSet.add("Maria");
        MeuSet.add("Maria"); // Não permite duplicatas, então "Maria" não será adicionado

        System.out.println("Set: " + MeuSet.contains("Henrique")); // Verifica se o set contém o valor "Henrique", retorna true

        System.out.println("Meu set" + MeuSet); // imprime o set, que não contém valores duplicados

        // map
        Map <Integer,String > MeuMap = new HashMap<>(); // No map é nescessário declarar o tipo da chave e do valor, nesse caso ambos são String, para int usa Integer

        MeuMap.put(1, "Henrique"); // ultiliza o put para colocar os valores no map, o primeiro valor é a chave e o segundo é o valor
        MeuMap.put(2, "Maria");
        MeuMap.put (3,"Joao");

        System.out.println(MeuMap.get(2));

        // queue
        Queue<String> MinhaQueue = new LinkedList<>(); // classe para implementar a estrutura de dados Queue, que segue a regra FIFO, ele sempre aponta para o proximo valor
        MinhaQueue.add("Henrique");
        MinhaQueue.add("Maria");
        MinhaQueue.add("Joao");

        System.out.println("Queue: "+ MinhaQueue.poll()); // aqui ele imprime o primeiro valor e remove ele da fila "Henrique"
        System.out.println("Queue: "+ MinhaQueue.peek()); // aqui ele imprime o primeiro valor e  não remove ele da fila "Maria" - peek = espiar
        System.out.println("Queue: "+ MinhaQueue.remove()); // aqui ele imprime o primeiro valor e remove ele da fila "Maria", lança uma exceção se a fila estiver vazia 'erro'
        System.out.println("Queue" + MinhaQueue); // aqui ele imprime todos os valores restantes na fila, que são "Maria" e "Joao"

        // existe ainda o LinkedList que possue algumas outras funcinalidades como addFirst etc.


        //Generics -> Tipos parametrizadas, são usadas para garantir a segurança de tipos em tempo de compilação, ou seja,
        // para evitar erros de tipo em tempo de execução.Assim, eles são facilmente reultilizadas com a tipagem diferente, por exemplo,
        // se eu quiser criar uma lista de inteiros, eu posso usar List<Integer> minhaLista = new ArrayList<>();
        // e se eu quiser criar uma lista de strings, eu posso usar List<String> minhaLista = new ArrayList<>();
        // sem precisar criar uma nova classe para cada tipo de dado que eu quero armazenar.


    }
}
