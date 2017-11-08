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
public class Asignatura_Distancia extends Asignatura {

    private int numero_creditos;

    public Asignatura_Distancia(String n, String t, double c, int n_c) {
        super(n, t, c);
        establecer_Numero_creditos(n_c);
    }

    public int obtener_Numero_creditos() {
        return numero_creditos;
    }

    public void establecer_Numero_creditos(int n_c) {
        numero_creditos = n_c;
    }
    @Override
    public String toString() {
        String c = String.format("Asignatura Precencial:\n%s\n:%s"
                + "Creditos %d\n",Obtener_Nombre(),super.toString(),obtener_Numero_creditos());
        return c;
    }

}
