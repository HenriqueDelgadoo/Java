import java.util.Scanner;
public class salario {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int id  = sc.nextInt();
        int horas = sc.nextInt();
        double passe =  sc.nextDouble();
        double salario = horas * passe;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f",id,salario);
    }
}
