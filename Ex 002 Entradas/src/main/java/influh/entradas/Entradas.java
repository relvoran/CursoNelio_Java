/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package influh.entradas;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Entradas {

    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        char x;
        System.out.print("Digite o seu nome: ");
        x = nome.next().charAt(2);
        System.out.printf("Seu nome é: %s", x);
        
    }
}
