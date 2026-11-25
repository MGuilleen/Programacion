//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
       int numero1 = 6;
       int numero2 = 3;
       int contador = 0;

       int suma = numero1 + numero2;
       int resta = numero1 - numero2;
       int producto = numero1 * numero2;
       double division = (double) numero1 / numero2;
       int resto = numero1 % numero2;
       System.out.println("La suma es :" + suma + " " + "La resta es :" + resta);
       System.out.println("La multiplicacion es :" + producto);
       System.out.println("La division es :" + division);
       System.out.println("El resto es :" + resto);

       contador++;
       System.out.println("Contador incrementado: " + contador);

       contador--;
       System.out.println("Contador decrementado: " + contador);
   }
}