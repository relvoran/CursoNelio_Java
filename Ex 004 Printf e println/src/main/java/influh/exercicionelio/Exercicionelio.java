/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package influh.exercicionelio;

import java.util.Locale;

/**
 *
 * @author Renato
 */
public class Exercicionelio {

    public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office desk";
    int age = 30;
    int code = 5290;
    char gender = 'F';
    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;
    
        System.out.println("Products:");
        System.out.println(product1 + ", which price is $ " + price1);
        System.out.printf("%s, which price is $ $.2f%n", product2, price2);
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + ".");
        System.out.printf("Record: %d years old, code %d and gender: %c. %n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);


//Products:
// Computer, which price is $ 2100,00
// Office desk, which price is $ 650,50
// Record: 30 years old, code 5290 and gender: F
// Measue with eight decimal places: 53,23456700
// Rouded (three decimal places): 53,235
// US decimal point: 53.235
    }
}
