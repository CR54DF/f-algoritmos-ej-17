/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructores;

/**
 *
 * @author crsyhian
 */
public class Carrera {

    private String nombre;
    private String modalidad;

    public Carrera() {
        modalidad = "Distancia";

    }

    public Carrera(String md) {
        modalidad = md;
    }

    public Carrera(String n, String md) {
        nombre = n;
        modalidad = md;
    }

    public void establecer_nombre(String n) {
        nombre = n;

    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_modalidad(String md) {
        md = modalidad;

    }

    public String obtener_modalidad() {
        return modalidad;
    }
}
