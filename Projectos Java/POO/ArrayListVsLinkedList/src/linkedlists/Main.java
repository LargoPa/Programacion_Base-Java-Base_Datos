
package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1,"Rodrigo",35));
        listaArray.add(new Persona(2,"Chileno",17));
        listaArray.add(new Persona(3,"Elia",30));
        listaArray.add(new Persona(4,"Webon",20));
        
        List<Persona> listaLinked = new LinkedList<Persona>();        
        listaLinked.add(new Persona(1,"Rodrigo",35));
        listaLinked.add(new Persona(2,"Chileno",17));
        listaLinked.add(new Persona(3,"Elia",30));
        listaLinked.add(new Persona(4,"Webon",20));
        
        //remove en ArrayList
        listaArray.remove(1);
        
        //remove en LinkedList
        String nombreBorrar = "Chileno";
        for(Persona persona2: listaLinked){
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break;
            }
        }
        
        System.out.println("-----Luego de Eliminar-----");
        
        System.out.println("-----ARRAY LIST-----");
        for(Persona persona:listaArray){
            System.out.println("prueba "+persona.getNombre());
        }
        
        System.out.println("-----LINKED LIST-----");
        for(Persona persona:listaLinked){
            System.out.println("prueba "+persona.getNombre());
        }
        
        //tamaño lista
        System.out.println("-----Tamaño de la lista-----");
        System.out.println("ArrayList: "+ listaArray.size());
        System.out.println("LinkedList: "+listaLinked.size());
        
        //obtener primer objeto
        System.out.println("----Primer y ultimo objeto (solo para LINKED LIST----");
        
        
        //borrar toda la lista
        System.out.println("----Borrando listas----");
        listaArray.clear();
        listaLinked.clear();
        
        //combrobar si esta vacia
        System.out.println("----Esta vacia alguna lista?----");
        System.out.println("ArrayList: "+listaArray.isEmpty());
        System.out.println("LinkedList: "+listaLinked.isEmpty());
        
        
        
        
        
    }
    
}
