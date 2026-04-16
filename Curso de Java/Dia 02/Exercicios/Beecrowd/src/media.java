import java.util.Scanner;
public class media {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        double a  =  sc.nextDouble();
        double b  =  sc.nextDouble();
        double nota = ((a*3.5) + (b*7.5)) /11.0;

        System.out.printf("%.5f\n", nota);
        sc.close();
    }
}
