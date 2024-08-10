import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student aluno = new Student();
        Locale.setDefault(Locale.US);

        System.out.print("Nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.print("Nota P1: ");
        aluno.first = sc.nextDouble();
        System.out.print("Nota P2: ");
        aluno.second = sc.nextDouble();
        System.out.print("Nota P3: ");
        aluno.third = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", aluno.FinalGrade());

        if (aluno.FinalGrade()<60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.MissingPoints());
        }
        else {
            System.out.println("PASS");
        }


        sc.close();

    }
}