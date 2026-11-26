import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        prueba p = new prueba();
        p.probar();

        menu();
    }

    public static void menu(){
        int opcion=0;
        int tamanio=0;
        int[]gonzalo = new int[0];


        Scanner mgg = new Scanner(System.in);
        do {
            System.out.println("---------- MENU -------------");
            System.out.println("1. Crear y rellenar array");
            System.out.println("2. Mostrar array");
            System.out.println("3. Ordenar array");
            System.out.println("4. Salir");
            System.out.println("-------- DE PRACTICA ---------");
            System.out.print("Seleccione una opcion: ");
            opcion = mgg.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Dame el tamaño del array");
                    tamanio = mgg.nextInt();
                    gonzalo = new int[tamanio];

                    for (int i = 0; i < tamanio; i++) {
                        System.out.println("Dame un valor");
                        gonzalo[i] = mgg.nextInt();
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < tamanio; i++) {
                        System.out.println(gonzalo[i]);
                    }
                    break;
                }
                case 3: {
                    int n = tamanio;

                    for (int i = 1; i < n; i++) {
                        int key = gonzalo[i];
                        int j = i - 1;

                    /*Mueve los elementos del subarray ordenado hacia la
                    derecha hasta encontrar la posición correcta para key*/

                        while (j >= 0 && gonzalo[j] > key) {
                            gonzalo[j + 1] = gonzalo[j];
                            j = j - 1;
                        }

                        gonzalo[j + 1] = key;



                    }

                    for(int i = 0; i < n; i++){
                        System.out.println(gonzalo[i]);
                    }

                    break;
                }

                case 4: {
                    System.out.println("Ha seleccionado salir ");
                    break;
                }
                default: {
                    System.out.println("Seleccione un numero correcto");
                }
            }

        }while(opcion!=4);
    }


}