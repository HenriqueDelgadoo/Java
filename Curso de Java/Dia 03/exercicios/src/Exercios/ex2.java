package Exercios;
import java.util.*;
public class ex2 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero (acima de 1, 0 para o programa): ");
        List<Integer> Lista2 =  new ArrayList<>();

        while (true) { // enquanto for diferente de 0 ele armazena na lista
            int n = sc.nextInt();
            if (n == 0) break;
            Lista2.add(n);
        }

           for (int i : Lista2) {
                if(i%2 == 0) {
                    System.out.println(i); // imprime todos dos numeros pares da lista
                }
           }
            sc.close();
    }
}
