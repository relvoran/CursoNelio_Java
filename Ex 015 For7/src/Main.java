import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=1; i<=x ; i++){
            int a = i*i;
            int b = i*i*i ;
            System.out.printf("%d %d %d%n", i, a, b);
        }

    }
}