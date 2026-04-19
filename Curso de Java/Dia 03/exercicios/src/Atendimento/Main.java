package Atendimento;

public class Main {
    public static void main (String []args){
        filaAtendimento fila = new filaAtendimento();
        fila.adicionarPessoa(new pessoa("Henrique", 20));
        fila.adicionarPessoa(new pessoa("Maria", 25));

        fila.proximaPessoa();
        fila.atenderPessoa();
        fila.proximaPessoa();
    }
}
