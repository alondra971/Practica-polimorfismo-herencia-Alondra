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
public class gerente extends administrativo {

    public gerente(int cod_adm, String cargo, String nombre, String apellidos, int edad) {
        super(cod_adm, cargo, nombre, apellidos, edad);
    }
     
         public void gerencia(){
             System.out.println("Trabaja en la gerencia de Bienestar");
             System.out.println();
         }
}
