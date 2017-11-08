/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        Profesor p = new Profesor(1000.1);
        System.out.println(p.getNombre());
        Profesor p1 = new Profesor();
        System.out.println(p1.getNombre());
        Profesor p2 = new Profesor("luis", "Alvares", 20, 3000.2);
        System.out.println(p2.getNombre());
        Estudiante e1 = new Estudiante("Juan", "andrade", 17, 2.2);
        System.out.println("juan edad:" + e1.getEdad());
        Profesor p3 = new Profesor("maria", "rivas", 30, 2.0);
        System.out.println("Edad Maria:" + p3.getEdad());
    }

}
