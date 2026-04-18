package Exercios;
import java.util.*;

public class ex5 {
    public static void main (String []args){
        Map <String, Integer> usuarios = new HashMap<>();

        usuarios.put("Joao", 20);
        usuarios.put("Maria", 25);
        usuarios.put("Pedro", 18);

        System.out.println("Idade de Maria: " + usuarios.get("Maria"));
    }
}
