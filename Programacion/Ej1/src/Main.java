
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        String palabra;

        System.out.println("Dime el número");
        numero = entrada.nextInt();
        System.out.println("Tu numero es: " + numero);

        System.out.println("Dime la palabra");
        palabra = entrada.next();
        System.out.println("Tu palabra es: " + palabra);

        entrada.close();
    }
}