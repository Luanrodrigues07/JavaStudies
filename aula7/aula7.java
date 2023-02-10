package aula7;
import java.util.Locale;
import java.util.Scanner;

public class aula7 {
    public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double x1, x2, x3, y1, y2 ,y3;

    System.out.println("Enter the measures of triangule X: ");
    x1 = sc.nextDouble();
    x2 = sc.nextDouble();
    x3 = sc.nextDouble();

    System.out.println("Enter the measures of triangule Y: ");
    y1 = sc.nextDouble();
    y2 = sc.nextDouble();
    y3 = sc.nextDouble();

    double p = (x1 + x2 + x3) / 2;
    double areax = Math.sqrt(p* (p - x1) * (p - x2) * (p - x3));

    p = (y1 + y2 + y3) / 2;
    double areay = Math.sqrt(p * (p - y1) * (p - y2) * (p - y3));

    System.out.printf("Triangule X area : %.4f%n", areax);
    System.out.printf("Trinagule Y area : %.3f%n", areay);

    if (areax > areay){
        System.out.println(areax);
    }
    else {
        System.out.println(areay);
    }



    sc.close();
    
}
}