
package arraylists;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona>();        
        lista.add(new Persona(1,"Rodrigo",35));
        lista.add(new Persona(2,"Chileno",17));
        lista.add(new Persona(3,"Elia",30));
        lista.add(new Persona(4,"Webon",20));
        
        System.out.println("POR INDICE");
        //recorrer por indice
        for(int i=0;i<lista.size();i++){
            System.out.println("prueba: "+lista.get(i).getNombre());    
        }
        System.out.println("----------------");
        System.out.println("POR FOREACH");
        //recorrer foreach
        for(Persona perso:lista){
            System.out.println("prueba: "+perso.getNombre());
        }
        
        
    }
    
}
