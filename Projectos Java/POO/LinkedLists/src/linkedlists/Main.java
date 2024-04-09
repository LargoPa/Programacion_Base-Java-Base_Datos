
package linkedlists;

import java.util.LinkedList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();        
        
        lista.add(new Persona(1,"Rodrigo",35));
        lista.add(new Persona(2,"Chileno",17));
        lista.add(new Persona(3,"Elia",30));
        lista.add(new Persona(4,"Webon",20));
        
        //agregar al principio
        lista.add(0,new Persona(5,"Peruano",59));
        
        System.out.println("----FOREACH----");
        for(Persona perso:lista){
            System.out.println("prueba: "+perso.getNombre());
        }
        
        
    }
    
}
