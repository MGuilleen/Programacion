import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        int lado1 = 0;
        int lado2 = 0;
        int area = 0;

        System.out.println("Dime un lado");
        lado1 = calculo.nextInt();
        System.out.println("Dime otro lado");
        lado2 = calculo.nextInt();

        area = lado1 * lado2;
        System.out.println("El area es: " + area);
    }
}