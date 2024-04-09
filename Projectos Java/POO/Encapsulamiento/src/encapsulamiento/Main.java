
package encapsulamiento;


public class Main {

    
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno(15,"Rodri","Penoso");
        
        System.out.println("id: "+a2.getId());
        System.out.println("nombre: "+a2.getNombre());
        System.out.println("apellido: "+a2.getApellido());
        
        
    }
    
}
