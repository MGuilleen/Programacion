import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        double resultado1 = 0;
        double resultado2 = 0;
        double resultado3 = 0;
        double resultado4 = 0;
        boolean bl1 = true;
        boolean bl2 = true;
        boolean bl3 = true;

        System.out.println("Dime el primer número");
        numero1 = entrada.nextInt();
        System.out.println("Dime el segundo número");
        numero2 = entrada.nextInt();
        System.out.println("Dime el ultimo número");
        numero3 = entrada.nextInt();

        resultado1 = numero1+numero2+numero3;
        System.out.println("La suma es: " + resultado1);

        resultado2 = numero1-numero2-numero3;
        System.out.println("La resta es: " + resultado2);

        resultado3 = numero1/numero2/numero3;
        System.out.println("La division es: " + resultado3);

        resultado4 = numero1*numero2*numero3;
        System.out.println("La multiplicacion es: " + resultado4);

        System.out.println("Dame el primer valor de la booleana(true o false): ");
        bl1=entrada.nextBoolean();

        entrada.close();


    }
}