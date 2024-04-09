
package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Carrera;
import logica.Controladora;
import logica.Materia;
import persistencia.ControladoraPersistencia;


public class Main {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        //Creamos lista de materias
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        //Creacion carrera con lista de materias
        Carrera carre = new Carrera(10,"Tecnicatura en Programacion",listaMaterias);
        //Guardado carrera en BD
        control.crearCarrera(carre);
        
        //Creacion Materias
        Materia mate1 = new Materia(58,"Programacion 1","Cuatrimetral",carre);
        Materia mate2 = new Materia(59,"Programacion 2","Cuatrimetral",carre);
        Materia mate3 = new Materia(60,"Programacion Avanzada","Anual",carre);
        
        //Guardado Materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregamos las materias a la lista
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
                       
        //Creacion alumno (con carrera)
        Alumno al = new Alumno(1,"Largo","Pa",new Date(),carre);
        
        //Guardamos el alumno en la BD
        control.crearAlumno(al);
        
        //vemos el resultado
        System.out.println("-------------------");
        System.out.println("-----Datos ALUMNOS-------");
        Alumno alu = control.traerAlumno(1);
        System.out.println("Alumno: "+alu.getNombre()+" "+alu.getApellido());
        System.out.println("Cursa la carrera de: "+alu.getCarre().getNombre());
        
    }
}
