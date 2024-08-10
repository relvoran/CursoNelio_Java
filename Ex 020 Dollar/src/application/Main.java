package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double cota = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double dollar = sc.nextDouble();
        double reais = CurrencyConverter.Convertion(dollar, cota);

        System.out.printf("Amount to be paid in reais = %.2f%n", reais);

    }
}