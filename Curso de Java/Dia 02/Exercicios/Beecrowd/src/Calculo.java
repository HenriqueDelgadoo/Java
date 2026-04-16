import java.util.Scanner;
public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double count = 0;

        for (int i = 0; i < 2; i++) {
            int cod = sc.nextInt();
            int qntd = sc.nextInt();
            double preco = sc.nextDouble();
            count = count + (qntd * preco);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f", count);
    }
}
