import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        int semanas = 0;
        int minuto = 0;

        System.out.println("Dime el numero de semanas");
        semanas = calculo.nextInt();

        minuto = (60*24)*(7*semanas);
        System.out.println("La cantidad de miuntos que hay en: " + semanas + " semanas es: " + minuto);
    }
}