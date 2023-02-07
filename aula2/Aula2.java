import java.util.Locale;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Aula2 {
public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
String dia;

if (x == 1){
    dia = "domingo";
}
else if (x == 2){
    dia = "segunda";
}
else if (x == 2){
    dia = "terça";
}
else if (x == 2){
    dia = "quarta";
}
else if (x == 2){
    dia = "quinta";
}
else if (x == 2){
    dia = "sexta";
}
else if (x == 2){
    dia = "sabado";
}
else {
    dia = "Valor invalido";
}
 System.out.println("O dia da semana é" + x);

sc.close();

}   
}   
