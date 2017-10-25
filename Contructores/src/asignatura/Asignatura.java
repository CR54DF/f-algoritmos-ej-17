/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignatura;

/**
 *
 * @author crsyhian
 */
public class Asignatura {

    private String nombre;
    private int creditos;
    private Carrera carrera;

    public Asignatura(Carrera c) {
        carrera = c;
        nombre = "Informatica";
        creditos = 5;
    }

    public String obtener_Nombre() {
        return nombre;
    }

    public void establecer_Nombre(String n) {
        n = nombre;
    }

    public int obtener_Creditos() {
        return creditos;
    }

    public void establecer_Creditos(int c) {
        c = creditos;
    }

    public Carrera obtener_Carrera() {
        return carrera;
    }

    public void establecer_Carrera(Carrera ca) {
        ca = carrera;

    }

    @Override
    public String toString() {
        String cadena = String.format("Asignatura\n"
                + "Nombre:%s\n"
                + "Creditos:%d\n"
                + "Modalidad:%s\n"
                + "Carrera:%s",obtener_Nombre(),obtener_Creditos(),obtener_Carrera().obtener_nombre(),
                obtener_Carrera().obtener_modalidad());
        return cadena;
    }

}
