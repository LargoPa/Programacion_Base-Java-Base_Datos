
package linkedlists;


public class Persona {
    
    private int nro;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int nro, String nombre, int edad) {
        this.nro = nro;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
            
    
}
