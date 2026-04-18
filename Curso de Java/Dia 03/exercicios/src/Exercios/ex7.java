package Exercios;
import java.util.*;

public class ex7 {
    public static void main(String[] args) {

        Queue<String> atendimento = new LinkedList<>();

        atendimento.add("Henrique");
        atendimento.add("Reinaldo");
        atendimento.add("Maria");

        String atendido = atendimento.poll();

        if (atendido != null) { // tente sempre tratar os erros caso seja vazio 'null'
            System.out.println(atendido + " foi atendido");
        }

        String proximo = atendimento.peek();

        if (proximo != null) {
            System.out.println("Próxima pessoa: " + proximo);
        }

    }
}