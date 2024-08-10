
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0 ; i < x ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                System.out.println("Divisão impossível");
            }
            System.out.println((double) a / b);
        }
    }
}