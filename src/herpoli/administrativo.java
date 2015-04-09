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
public class administrativo extends persona{
 

    public administrativo(int cod_adm, String cargo, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
      
   }
    
    public void administrar(){
        System.out.println("Administrar pagos");
    }
}
     
 
                 
 