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
public class contador extends administrativo {

    public contador(int cod_adm, String cargo, String nombre, String apellidos, int edad) {
        super(cod_adm, cargo, nombre, apellidos, edad);
    }
    
     public void contabilidad(){
         System.out.println("Contador de Escuela Academica");
         System.out.println();   
     
     }
}
