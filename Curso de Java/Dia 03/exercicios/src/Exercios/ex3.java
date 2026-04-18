package Exercios;
import java.util.*;
public class ex3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Set<String> Usuarios =  new HashSet<>();
        int verificador = 0;

        while (verificador < 10) {
            String nomes = sc.nextLine();
            Usuarios.add(nomes);
            verificador ++;
        }
        System.out.println("Quantidade de usuarios: "+ Usuarios.size());
    }
}
