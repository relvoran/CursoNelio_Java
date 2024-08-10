/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package influh.exnelioum;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Exnelioum {

    public static void main(String[] args) {
        int x, y, soma;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        x = sc.nextInt();
        
        System.out.print("Digite um segundo número: ");
        y = sc.nextInt();
        
        soma = x+y;
        System.out.println("");
        
        System.out.println("A soma de " + x + " e " + y + " é " + soma + ".");
        
        sc.close();
        
    }
}
