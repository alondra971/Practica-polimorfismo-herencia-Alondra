/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herpoli;

public abstract class persona {
    String nombre,apellidos;
    int edad;

    public persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public  void estudiar()
    {
        System.out.println("Estoy estudiando");
        System.out.println("Ya empezaron mis Clases");
    }
    public  void concentrarse()
    {
        System.out.println("Concentrarse");
        System.out.println("Yo me estoy concentrando");
    }
   
   
    public void examen()
    {
        System.out.println("Estoy dando mi examen");
        System.out.println("Todavia no termino mi examen");
    }
    
   
    }
    
