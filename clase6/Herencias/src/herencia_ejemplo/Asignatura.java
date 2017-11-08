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
public class Asignatura {

    private String nombre;
    private String tipo;
    private double costo;

    public Asignatura(String n, String t, double c) {
        establecer_Nombre(n);
        establecer_Tipo(t);
        estaqblecer_Costo(c);

    }

    public String Obtener_Nombre() {
        return nombre;
    }

    public void establecer_Nombre(String n) {
        nombre = n;
    }

    public String obtener_Tipo() {
        return tipo;
    }

    public void establecer_Tipo(String t) {
        tipo = t;
    }

    public double obtener_Costo() {
        return costo;
    }

    public void estaqblecer_Costo(double c) {
        costo = c;
    }

    @Override
    public String toString() {
        String c = String.format("%s\n "
                + " %.2f\n", obtener_Tipo(), obtener_Costo());
        return c;
    }

}
