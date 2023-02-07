import java.util.Locale;
import java.util.Scanner;

public class Aula3 {
    public static void Main (String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double preco = sc.nextInt();
    // se preço menor que 20 então o desconto é de 0.1 se não é 0.5
    double desconto = (preco <20.0) ? preco * 0.1 : preco * 0.5;

    System.out.printf("O valor do desconto é", desconto);


    
    sc.close();
    
}
}