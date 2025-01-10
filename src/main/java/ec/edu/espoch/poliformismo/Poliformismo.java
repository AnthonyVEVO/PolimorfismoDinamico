/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.poliformismo;

import ec.edu.espoch.poliformismo.clases.Estudiante;

/**
 *
 * @author SO-LAB1-PC28
 */
public class Poliformismo {

    public static void main(String[] args) {
        Estudiante objEstudiante = new Estudiante (3815, "2200336630" , "Anthony","Moreira" );
        
        
        System.out.println("Datos de los estudiantes");
        System.out.println(objEstudiante.imprimir());
    }
}
