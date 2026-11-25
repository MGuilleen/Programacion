import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            int valorCompra = 0;
            int tarjeta = 0;
            int opcion = 0;

            System.out.println("Introduzca valor de compra: ");
            valorCompra = teclado.nextInt();

            if (valorCompra < 50)
            {
            System.out.println("Compra pequeña");
            }else if (valorCompra >=50 && valorCompra < 200 ){
            System.out.println("Compra mediana");
            }else{
            System.out.println("Compra grande");
            }

            System.out.println("¿Dispone de tarjeta cliente?(0=No,1=Si)");
            tarjeta = teclado.nextInt();

            if (tarjeta == 1) {
            System.out.println("Cliente registrado");
            }else {
            System.out.println("Cliente no registrado");
            }

            System.out.println("Elija una opcion de entrega");
            System.out.println("1.Recogida en tienda");
            System.out.println("2.Envío estandar");
            System.out.println("3.Envío urgente");
            opcion = teclado.nextInt();

            switch(opcion){

                case 1:{ // se pone case 1 o lo que toque y dos puntos nada de parentesis
                System.out.println("Ha seleccionado recogida en tienda");
                break; // Poner break al acabar un caso
                }
                case 2:{
                System.out.println("Ha seleccionado envio estandar");
                break;
                }
                case 3:{
                System.out.println("Ha seleccionado envio urgente");
                break;
                }
                default :{
                System.out.println("Introduzca un valor válido");
                break;
                }


            }
    }
}