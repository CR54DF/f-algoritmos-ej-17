/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author crsyhian
 */
public class Profesor extends Persona {

    private double sueldo;

    public Profesor(double s) {
        super("Rene", "Elizalde", 34);

    }
     public void setEdad(int e) {
        if (edad < 35) {
            edad = 35;
        } else {
            edad = e;
        }
    }

    public Profesor() {
        super("andres", "marin", 58);
    }

    public Profesor(String n, String a, int ed, double s) {
        super(n, a, ed);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }

}
