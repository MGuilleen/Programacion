import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    menu();
    }

    public static void menu(){
        int opcion=0;
        int tamanio=0;
        int[]gonzalo = new int[0];


        Scanner mgg = new Scanner(System.in);
        do {
            System.out.println("-------------------------");
            System.out.println("1. Crear y rellenar array");
            System.out.println("2. Mostrar array");
            System.out.println("3. Salir");
            System.out.println("-------------------------");
            System.out.print("Seleccione una opcion: ");
            opcion = mgg.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Dame el tamaño del array");
                    tamanio=mgg.nextInt();
                    gonzalo = new int[tamanio];

                    for(int i=0;i<tamanio;i++){
                    System.out.println("Dame un valor");
                    gonzalo[i] =mgg.nextInt();
                    }
                    break;
                }
                case 2: {
                    for(int i=0;i<tamanio;i++){
                        System.out.println(gonzalo[i]);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ha seleccionado salir ");
                    break;
                }
                default: {
                    System.out.println("Seleccione un numero correcto");
                }
            }
        }while(opcion!=3);
    }
}