import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int nEntradas = 0;
        do {


            System.out.println("=====Teatro Altair=====");
            System.out.println("1. Vender entradas.");
            System.out.println("2. Consultar recaudación.");
            System.out.println("3. Salir.");
            System.out.println("====================== ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1: {
                    System.out.println("Ha seleccionado vender entradas");

                    do{
                        System.out.println("¿Cuantas entradas desea comprar?:");
                        nEntradas = sc.nextInt();
                        if(nEntradas>=1 && nEntradas<=8){
                            System.out.println("Ha seleccionado: " + nEntradas + " entrada/s");
                        }else{
                            System.out.println("Seleccione una opcion valida");
                        }
                    }while(nEntradas<1 || nEntradas>8);
                    break;
                }
                case 2: {
                    System.out.println("Ha seleccionado consultar recaudación");
                    break;
                }
                case 3: {
                    System.out.println("Ha seleccionado salir");
                    break;
                }
                default: {
                    System.out.println("Introduzca un valor válido");
                    break;
                }
            }

        } while (opcion != 3);{
        }

    }
}