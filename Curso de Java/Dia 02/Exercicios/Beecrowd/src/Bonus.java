import java.util.Scanner;
public class Bonus {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        String nome = sc.next();
        double s = sc.nextDouble();
        double vendas  = sc.nextDouble();
        double sComBonus = s + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", sComBonus);
    }
}
