import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        int horas = 0;
        int annos = 0;

        System.out.println("Dime el numero de años");
        annos = calculo.nextInt();

        horas = (24*365)*(annos);
        System.out.println("La cantidad de horas que hay en: " + annos + " años es: " + horas);
    }
}