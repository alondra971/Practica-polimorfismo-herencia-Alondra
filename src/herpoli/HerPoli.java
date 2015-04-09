/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herpoli;

import java.util.ArrayList;

/**
 *
 * @author alumno05
 */
public class HerPoli {

    
   
       public static ArrayList <persona> miembro=new ArrayList<persona>();
    public static void main(String[] args) {
         persona ab=new academico(1,"Alo     ",  "Diaz   ","Pezo",3) ;
         persona cd =new administrativo(2,"Carcel  ","Cole   ","Paredes  ",4);
         contador g=new contador(8,"Lula","diaz","juju",78);
         gerente o=new gerente(45,"aaa","bbb","ccc",78);
         tesorero k=new tesorero(4,"lola","perez","sosa",7);
         jefe_area w=new jefe_area(5,"lila","toza","disa",5);
         docente y=new docente(5,"rera","didi","melanza",8);
         coordinador r=new coordinador(4,"ghj","ghj","hjk",45);
         director_academico j=new director_academico(5,"erty","tyui","ghjk",5);
         miembro.add(ab);
         miembro.add(cd);
         
         for (persona nm :miembro)
  //estudiar()
    {
        System.out.println(nm.getNombre()+""+nm.getApellidos()+""+nm.getEdad());
        nm.estudiar();
        
    }
         //concentrarse
         for (persona nm :miembro)
      
    {
        System.out.println(nm.getApellidos()+""+nm.getNombre()+""+nm.getEdad());
        nm.concentrarse();
    }
   
   // examen
         for (persona nm :miembro)
      
    {
        System.out.println(nm.getApellidos()+""+nm.getNombre()+""+nm.getEdad());
        nm.examen();
    }
         System.out.println("\n");
        System.out.println("Administrativo"); 
         
  {
      System.out.println(g.getEdad()+g.getNombre()+g.getApellidos());
      g.contabilidad();}
    {
        System.out.println(o.getApellidos()+o.getNombre()+o.getEdad());
        o.gerencia();
    }
    {
        System.out.println(k.getApellidos()+k.getNombre()+k.getEdad()); 
        k.tesoreria();
    }
    {
        System.out.println(w.getApellidos()+w.getNombre()+w.getEdad());
        w.jefatura();
    }
    {
        System.out.println("Academico");
        {
            System.out.println(y.getApellidos()+y.getNombre()+y.getEdad());
            y.enseñar();
        }
        {
            System.out.println(r.getApellidos()+r.getNombre()+r.getEdad());
            r.coordinar();
        }
        {
            System.out.println(j.getApellidos()+j.getNombre()+j.getEdad());
            j.diracademic();
        }}}}
