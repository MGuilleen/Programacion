import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int actividad = 0;
        int edad = 0;
        int activida = 0;
        double pecio = 0;
        int opcion = 0;
        System.out.println(mostrarMenu());
    }
    public static void mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("===============================");
        System.out.println("     Actividades Culturales    ");
        System.out.println("===============================");
        System.out.println("1. Inscribir participante");
        System.out.println("2. Consultar inscripciones");
        System.out.println("3. Gestionar plazas");
        System.out.println("4. Cancelar inscripcion");
        System.out.println("5. Salir");
        System.out.println("Seleccione opcion: ");
        opcion = teclado.nextInt();

        switch(opcion){

            case 1:{
                System.out.println("Ha seleccionado inscribir participante");
                break;
            }
            case 2:{
                System.out.println("Ha seleccionado consultar participante");
                break;
            }
            case 3:{
                System.out.println("Ha seleccionado gestionar plazas");
                break;
            }
            case 4:{
                System.out.println("Ha seleccionado cancelar inscripcion");
                break;
            }
            case 5:{
                System.out.println("Ha seleccionado salir");
                break;
            }
            default :{
                System.out.println("Introduzca un valor válido");
                break;
            }


        }
    }
}








//for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }