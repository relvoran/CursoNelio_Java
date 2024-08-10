package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account;

        System.out.println("# # # # # # # # # # #");
        System.out.println("ACCOUNT CREATION FORM");
        System.out.println("# # # # # # # # # # #");
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        char resp;
        double initialDeposit = 0;
        do {
            System.out.print("Is there an initial deposit (y/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n' && resp != 'y');
        if (resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
            account = new Account(name, number, initialDeposit);
        }
        else {
            account = new Account(name, number);
        }
        account.getHolderName(name);
        System.out.println();
        System.out.println(account);
        System.out.println(       );

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.depositAmmount(deposit);
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdrawAmmount(withdraw);
        System.out.println(account);

    }
}