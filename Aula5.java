import java.util.Locale;
import java.util.Scanner;

public class Aula5 {
    public static void Main (String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int soma = 0;
    for(int i=0; i<N; i++)
    {
        int x = sc.nextInt();
        soma = soma + x;
    }
    System.out.println(soma);
    sc.close();
    
}
}