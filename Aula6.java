import java.util.Locale;
import java.util.Scanner;

public class Aula6 {
    public static void Main (String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    char resp;
    do {
        System.out.print("Qual a temperaura em Celsius?");
        Double C = sc.nextDouble();
        double F =  9.0 * C / + 32;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
        System.out.print("deseja repeitr (s/n) ?");
        resp = sc.next().charAt(0);
    } while (resp != 'n');

    sc.close();
    
}
}