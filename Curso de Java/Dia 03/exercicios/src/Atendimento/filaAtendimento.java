package Atendimento;

import java.util.*;

public class filaAtendimento {

    Queue<pessoa> atendimento = new PriorityQueue<>( // PriorityQueue é uma fila de prioridade, onde os elementos são ordenados com base em um critério definido
            (p1, p2) -> {
                if (p1.idade >= 60 && p2.idade < 60) return -1; // Se p1 for idoso e p2 não, p1 tem prioridade (retorna -1)
                if (p1.idade < 60 && p2.idade >= 60) return 1; // se p2 for idoso e p1 não, p2 tem prioridade (retorna 1)
                return 0; // Se ambos tiverem a mesma idade (ambos idosos ou ambos não idosos), mantém a ordem de chegada (retorna 0)
            }
    );

    public void adicionarPessoa(pessoa p) {
        atendimento.add(p);
    }

    public void atenderPessoa() {
        pessoa p = atendimento.poll();

        if (p != null) {
            System.out.println(p.nome + " foi atendido");
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void proximaPessoa() {
        pessoa p = atendimento.peek();

        if (p != null) {
            System.out.println("Próximo: " + p.nome);
        }
    }
}