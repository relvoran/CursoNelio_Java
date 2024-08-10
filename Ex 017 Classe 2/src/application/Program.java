package application;

import entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print(" Name: ");
        product.name = sc.nextLine();
        System.out.print(" Price: ");
        product.price = sc.nextDouble();
        System.out.print(" Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added to stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }

}
