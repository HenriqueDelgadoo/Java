package Atendimento;

public class pessoa {

         String nome;
         int idade;

         public pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
