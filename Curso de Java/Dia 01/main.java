import java.util.ArrayList; // necessário para usar ArrayList

public class main {

    public static void main(String[] args) {

        // ===============================
        // TIPOS PRIMITIVOS
        // ===============================

        int minhaIdade = 20; // inteiro (32 bits)

        String nomeVariavel = "Fernanda"; // Java NÃO usa "var" nesse caso (até existe var, mas evite por enquanto)

        // byte: -128 a 127 (8 bits)
        byte b = 100;

        // short: -32.768 a 32.767 (16 bits)
        short s = 1000;

        // int: números inteiros comuns (32 bits)
        int it = 10000;

        // long: números muito grandes (64 bits) -> precisa do "L"
        long l = 1000000L;

        // float: número decimal com menor precisão -> precisa do "f"
        float f = 10.5f;

        // double: decimal com maior precisão
        double d = 20.5;

        // char: apenas UM caractere
        char c = 'A';

        // String: texto (classe, não é primitivo)
        String str = "Henrique";

        // boolean: verdadeiro ou falso
        boolean bool = false;


        // ===============================
        // ARRAYS (vetores)
        // ===============================

        int[] listaInteiros = {1, 2, 3, 4, 5}; // tamanho fixo

        int[] meusNumeros = new int[10]; // array com 10 posições (inicia com 0)

        System.out.println(listaInteiros[0]); // acessa o primeiro elemento


        // ===============================
        // ARRAYLIST (dinâmico)
        // ===============================

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Henrique");
        nomes.add("Maria");

        System.out.println(nomes.get(1)); // Maria

        nomes.remove(0); // remove "Henrique"


        // ===============================
        // ESTRUTURA DE DECISÃO
        // ===============================

        if (bool) {
            System.out.println("Verdadeiro");

        } else if (str.equals("Henrique")) { 
            // Em Java NÃO se compara String com ==
            System.out.println("Falso");

        } else {
            System.out.println("Teste");
        }


        // ===============================
        // LOOPS
        // ===============================

        // FOR tradicional
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // FOR-EACH (mais usado em Java)
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // WHILE
        int count = 0;
        while (count < 10) {
            System.out.println("Estou no while");
            count++;
        }


        // ===============================
        // CASTING (conversão)
        // ===============================

        double resultado = 10.7;

        int resultadoInteiro = (int) resultado; 
        // perde a parte decimal → vira 10

        int meuInt = 10;
        double meuDouble = meuInt; // conversão automática

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // String -> int

        String minhaString2 = String.valueOf(meuInt2); // int -> String
    }
}