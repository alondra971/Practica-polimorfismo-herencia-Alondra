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
public class coordinador extends academico{

    public coordinador(int cod, String curso, String nombre, String apellidos, int edad) {
        super(cod, curso, nombre, apellidos, edad);
    }
   
        public void coordinar(){
            System.out.println("Estoy coordinando");
        }
    
}
