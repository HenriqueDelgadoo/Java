import java.util.Scanner;
import java.util.Locale;

public class Area {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double r = sc.nextDouble();
        double PI = 3.14159;
        double area = PI * (r * r);

        System.out.printf("A = %.4f\n", area);

        sc.close();
    }
}