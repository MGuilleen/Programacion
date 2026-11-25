import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mario = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Dame un número");
        numero1 = mario.nextInt();
        System.out.println("Dame otro numero");
        numero2 = mario.nextInt();

        pares(numero1,numero2);

        mario.close();
    }
    public static void pares(int numero1,int numero2){

        for(int i=numero1;i<=numero2;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}