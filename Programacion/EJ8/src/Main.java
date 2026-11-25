import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce el radio: ");
        double radio = teclado.nextDouble();


        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);


        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen de la esfera: " + volumen);

    }
}
