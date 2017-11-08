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
public class Asignatura_Presencial extends Asignatura {

    private int numero_horas;

    public Asignatura_Presencial(String n, String t, double c, int n_h) {
        super(n, t, c);
        establecer_Numero_horas(n_h);
    }

    public int obtener_Numero_horas() {
        return numero_horas;
    }

    public void establecer_Numero_horas(int n_h) {
        numero_horas = n_h;
    }
    @Override
    public String toString() {
        String c = String.format("Asignatura Precencial:\n%s\n%s"
                + "Horas %d\n",Obtener_Nombre(),super.toString(),obtener_Numero_horas());
        return c;
    }

}
