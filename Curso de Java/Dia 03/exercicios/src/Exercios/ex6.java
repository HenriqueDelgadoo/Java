package Exercios;
import java.util.*;

public class ex6 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        Map <String, Integer> entradas = new HashMap<>();

        while (true) {
            String nomes = sc.nextLine();
            entradas.put(nomes, entradas.getOrDefault(nomes, 0) + 1); // substitui todo o if e else q eu criei
            if(Objects.equals(nomes, "fim")) break;
            /*
            if (entradas.get(nomes) == null) {
                entradas.put(nomes, 1);
            }else {
                int i  = entradas.get(nomes) + 1;
                entradas.put(nomes,i);
            }*/

            }
            System.out.println(entradas);
        }
    }

