
package relaciones;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        Auto a1= new Auto();
        a1.setId(1L);
        a1.setMarca("Ferrari");
        a1.setModelo("2341F");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        Propietario p1= new Propietario();
        Propietario p2= new Propietario();
        
        p1.setId(35L);
        p1.setNombre("Rodrigo");
        p1.setApellido("De Pol");
        
        p2.setId(30L);
        p2.setNombre("Carapinga");
        p2.setApellido("Do sol");
        
        listaPropietarios.add(p1);
        listaPropietarios.add(p2);
        
        a1.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto "+a1.getMarca()+" "+a1.getModelo()+
            " tiene como propietarios a: "+ a1.getListaPropietarios().toString());
        
                
    }
    
}
