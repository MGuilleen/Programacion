import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        vocal();
    }
    public static boolean vocal(){
        Scanner myg = new Scanner(System.in);
        char letra;
        boolean letrita=false;
        System.out.println("Dame un caracter");
        letra = myg.next().charAt(0);

        while(letra!='0'){
            if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
               System.out.println("VOCAl");
            }else{
                System.out.println("NO VOCAl");
            }
            System.out.println("Introduce otro caracter (0 para terminar): ");
            letra = myg.next().charAt(0);
        }
        return letrita;
    }
}