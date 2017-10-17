/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author crsyhian
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int numero;
        int total;
        Scanner e = new Scanner(System.in);
        System.out.println("ingresa un numero");
        numero = e.nextInt();
        for (int i = 0; i <= 12; i++) {
            total = numero * i;
            System.out.printf("%s\t%s\t%s\t%s\t%s\n", numero, "*", i, "=", total);
        }
    }

}
