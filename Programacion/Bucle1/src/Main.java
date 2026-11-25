import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner mgg = new Scanner(System.in);
        int numero = 0;
        boolean salida = false;

        System.out.println("Dame un numero");
        numero=mgg.nextInt();

        while(!salida){
        if (numero < 0 || numero > 100){
            System.out.println("Numero fuera de rango");
            System.out.println("Dame un numero");
            numero=mgg.nextInt();

        }else{
            System.out.println("Numero válido");
            salida = true;
        }
        }
    }
}