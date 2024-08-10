import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cod, quant;
        double preco;
        Scanner sc = new Scanner(System.in);
        System.out.println("# # # # # # # # # # # # # # # # # #");
        System.out.println("# # # # DOGÃO  DO INFLUHZAO # # # #");
        System.out.println("Cód         Produto           Preço");
        System.out.println("___________________________________");
        System.out.println(" 1           HotDog         R$ 4.00");
        System.out.println(" 2          X-Salada        R$ 4.50");
        System.out.println(" 3          X-Bacon         R$ 5.00");
        System.out.println(" 4       Torrada Simples    R$ 2.00");
        System.out.println(" 5        Refrigerante      R$ 1.50");
        System.out.println("___________________________________");

        System.out.print("Qual o código do lanche que você quer: ");
        cod = sc.nextInt();
        System.out.print("Qual a quantidade: ");
        quant = sc.nextInt();

        if (cod == 1) {
            System.out.println("Seu pedido ficou em R$ " + quant *4.00);
        }
        else if (cod == 2) {
            System.out.println("Seu pedido ficou em R$ " + quant *4.50);
        }
        else if (cod == 3) {
            System.out.println("Seu pedido ficou em R$ " + quant*5.0);
        }
        else if (cod == 4) {
            System.out.println("Seu pedido ficou em R$ " + quant*2.50);
        }
        else if (cod == 5) {
            System.out.println("Seu pedido ficou em R$ " + quant*1.50);
        }
    }
}