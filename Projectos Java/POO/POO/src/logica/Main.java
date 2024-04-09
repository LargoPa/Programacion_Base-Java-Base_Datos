
package logica;


public class Main {

    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno(35,"Rodrigo","de Pol");
        
        System.out.println("La id del alumno 2 es "+a2.getId());
        System.out.println("Su nombre es "+a2.getNombre()+
                " y el apellido "+a2.getApellido());
        
        a1.setId(9);
        a1.setNombre("PUTO");
        a1.setApellido("Chileno");
        
        System.out.println("----------------");
        System.out.println("La id del alumno 1 es "+a1.getId());
        System.out.println("Su nombre es "+a1.getNombre()+
                " y el apellido "+a1.getApellido());
        
        System.out.println("-----------------");
        a2.setId(32);
        
    }
    
}
