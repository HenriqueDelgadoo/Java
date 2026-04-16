import java.util.Scanner;
public class Media2 {
    public static void main (String [] args){
        Scanner sc = new  Scanner(System.in);
        double a =  sc.nextDouble();
        double b =  sc.nextDouble();
        double c =  sc.nextDouble();

        double nota =  ((a*2) + (b*3) + (c*5)) / 10;

        System.out.printf("%.1f\n",nota);
    }
}
