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
public class academico extends persona{
   

    public academico(int cod, String curso, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    
   
    }
    public void estudiar(){
        System.out.println("Estudiar por las tardes");
    }
    
}
