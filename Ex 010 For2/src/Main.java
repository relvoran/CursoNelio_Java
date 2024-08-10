import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n, in, out, x, ord;
        System.out.println("Quantos valores: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        out = 0;
        in = 0;
        for (int i=0 ; i<n ; i++){
            ord = i+1;
            System.out.print("Digite o " + ord + ".o valor:");
            x = sc.nextInt();
            if (x<10 || x>20) {
                out = out + 1;
            }
            else {
                in = in+1;
            }

        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}