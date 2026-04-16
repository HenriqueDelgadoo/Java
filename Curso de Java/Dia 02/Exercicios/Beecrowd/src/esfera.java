import java.util.Scanner;
public class esfera {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double PI  = 3.14159;
         int r = sc.nextInt();
         double volume = (4.0/3)* PI *(r*r*r);

         System.out.printf("VOLUME = %.3f",volume);
    }
}
