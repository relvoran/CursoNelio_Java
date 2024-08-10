/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package influh.ex2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Ex2 {

    public static void main(String[] args) {
         double r, A;
        
        System.out.println("Este programa calculará a área de um cícrulo!");
        System.out.print("Digite o valor do raio: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        A = 3.14159 * Math.pow(r, 2);
        System.out.printf("A área do círculo é de: %.4f", A);
    }
}
