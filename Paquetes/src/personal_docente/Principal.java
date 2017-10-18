/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_docente;

import institucion.Asignatura;
import paquete_principal.Docente;
import paquete_principal.Titulo;

/**
 *
 * @author crsyhian
 */
public class Principal {

    public static void main(String[] args) {

        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matemáticas");
        a1.establecrer_creditos(8);

        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establecrer_creditos(6);

        Titulo t1 = new Titulo();
        t1.establecer_nombre("Licenciado en Físico Matemáticas");
        t1.establecer_nombre_universidad("Universidad Politécnica");

        Titulo t2 = new Titulo();
        t2.establecer_nombre("Magister en Docencia Matemática");
        t2.establecer_nombre_universidad("Universidad Valenciana");

        Docente d = new Docente();
        d.establecer_nombres("Luis V");
        d.establecer_apellidos("Perez J");
        d.establecer_asignatura_1(a1);
        d.establecer_asignatura_2(a2);
        d.establecer_tit_tercer_nivel(t1);
        d.establecer_tit_cuarto_nivel(t2);
        System.out.println(d);
        Asignatura a3 = new Asignatura();
        a1.establecer_nombre("Sociales");
        a1.establecrer_creditos(9);

        Asignatura a4 = new Asignatura();
        a2.establecer_nombre("Literatura");
        a2.establecrer_creditos(10);

        Titulo t3 = new Titulo();
        t1.establecer_nombre("Licenciado en Ciencias Sociales");
        t1.establecer_nombre_universidad("Universidad Salesiana");

        Titulo t4 = new Titulo();
        t2.establecer_nombre("Magister en Docencia Social");
        t2.establecer_nombre_universidad(" Universidad Cataluña");

        Docente d1 = new Docente();
        d1.establecer_nombres("Ana M.");
        d1.establecer_apellidos("Velez P.");
        d1.establecer_asignatura_1(a1);
        d1.establecer_asignatura_2(a2);
        d1.establecer_tit_tercer_nivel(t1);
        d1.establecer_tit_cuarto_nivel(t2);
        System.out.println(d1);

    }
}
