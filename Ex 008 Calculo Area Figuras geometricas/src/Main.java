import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("- - - - ESSE PROGRAMA CALCULARÁ A ÁREA DE - - - -");
        System.out.println("Triângulo, Cículo, Trapézio, Quadrado e Retângulo");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");

        double A, B, C, areaT, areaC, areaTp, areaQ, areaR;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o tamanho do segmento de reta A: ");
        A = sc.nextDouble();
        System.out.print("Escreva o tamanho do segmento de reta B: ");
        B = sc.nextDouble();
        System.out.print("Escreva o tamanho do segmento de reta C: ");
        C = sc.nextDouble();

        areaT = A*C/2;
        areaC = 3.14159*Math.pow(C,2);
        areaTp = ((A+B)/2)*C;
        areaQ = B*B;
        areaR = A*B;

        System.out.printf("A área do Triângulo Retângulo de base A = %.1f e altura C = %.1f é de %.3f%n", A, C, areaT);
        System.out.printf("A área de um Círculo de raio C = %.1f é de %.3f%n", C, areaC);
        System.out.printf("A área de um Trapézio que tem base A = %.1f e base B = %.1f e altura C = %.1f é igual a %.3f%n", A, B, C, areaTp);
        System.out.printf("A área de um Quadrado de lado B = %.1f é de %.3f%n", B, areaQ);
        System.out.printf("A área de um Retângulo de lado A = %.1f e de lado B = %.1f é de %.3f%n", A, B, areaR);





    }
}