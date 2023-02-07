import java.util.Locale;
import java.util.Scanner;

public class Aula4 {
    public static void Main (String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double largura = sc.nextDouble();
    double comprimento = sc.nextDouble();
    double metroQuadrado = sc.nextDouble();

    double area = largura * comprimento;
    double preco = area * metroQuadrado; 

    System.out.printf("area =", area);
    System.out.printf("Preco =", preco);

    
    sc.close();
    
}
}