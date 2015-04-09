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
public class jefe_area extends academico{

    public jefe_area(int cod, String curso, String nombre, String apellidos, int edad) {
        super(cod, curso, nombre, apellidos, edad);
    }
     
     public void jefatura(){
         System.out.println("Jefe de la universidad");
         System.out.println();
     }
}
