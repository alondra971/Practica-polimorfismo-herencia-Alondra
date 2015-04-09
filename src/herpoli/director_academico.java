/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herpoli;

/**
 *
 * @author alumno05
 */
public class director_academico extends academico {

    public director_academico(int cod, String curso, String nombre, String apellidos, int edad) {
        super(cod, curso, nombre, apellidos, edad);
    }
    
            public void diracademic(){
                System.out.println("Es director academico de la UPeU");
            }
}
