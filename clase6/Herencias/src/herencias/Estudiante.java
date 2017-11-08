/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herencia_ejemplo.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    private double matricula;
    private Asignatura_Presencial [] estudinate;

    public Estudiante(String n, String a, int e, double mat,Asignatura_Presencial[]) {
        super(n, a, e);
        setMatricula(mat);
    }

    public void setEdad(int e) {
        if (edad < 18) {
            edad = 18;
        } else {
            edad = e;
        }
    }

    public void Asignatura_P(Asignatura_Presencial[] a) {
        

    }

    public void setMatricula(double mat) {
        matricula = mat;
    }

    public double getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {

        return String.format("%s - %f", super.toString(), getMatricula());
    }

    // @Override
    // public String toString(){
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
