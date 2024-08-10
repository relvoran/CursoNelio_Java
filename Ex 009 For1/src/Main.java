import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Imprime números ímpares entre 1 e o número digitado

        Scanner sc = new Scanner(System.in);
        int x,i;
        System.out.print("Digite um número de 1 a 1000: ");
        x = sc.nextInt();
        while (x<1 || x>1000){
            System.out.println("Número inválido");
            System.out.print("Digite um número de 1 a 1000: ");
            x = sc.nextInt();
        }
            for (i=1 ; i<=x ; i = i+2) {
                System.out.println("Ímpar: " + i);
            }




    }
}