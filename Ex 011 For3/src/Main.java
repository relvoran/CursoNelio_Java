import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n, ord, i;
        double x, y, z, media;
        System.out.print("Casos de teste: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0 ; i < n ; i++ ) {
            System.out.print("Valor de X (1 casa decimal): ");
            x = sc.nextDouble();
            System.out.print("Valor de Y (1 casa decimal): ");
            y = sc.nextDouble();
            System.out.print("Valor de Z (1 casa decimal): ");
            z = sc.nextDouble();
            media = (x * 2 + y * 3 + z * 5) / 10;
            ord = i + 1;
            System.out.printf("A média do %d.o caso é de %.2f%n", ord, media);
            System.out.println();

            sc.close();
        }
    }
}