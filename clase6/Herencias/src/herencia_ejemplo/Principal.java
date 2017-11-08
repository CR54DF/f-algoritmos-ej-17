/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejemplo;

/**
 *
 * @author crsyhian
 */
public class Principal {

    public static void main(String[] args) {
        Asignatura_Presencial a1 = new Asignatura_Presencial("programacion", "comun", 100, 180);
        System.out.println(a1);
        Asignatura_Presencial a2 = new Asignatura_Presencial("literatura", "tronca", 300, 200);
        System.out.println(a1);
        Asignatura_Presencial[] a = new Asignatura_Presencial[2];
        a[0] = a1;
        a[1] = a2;

    }

}
