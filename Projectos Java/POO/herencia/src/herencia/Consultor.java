
package herencia;


public class Consultor extends Persona{
    
    String nombre_consultora;
    int nro_consultor;

    public Consultor() {
    }
    
    public Consultor(String nombre_consultora, int nro_consultor, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.nro_consultor = nro_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNro_consultor() {
        return nro_consultor;
    }

    public void setNro_consultor(int nro_consultor) {
        this.nro_consultor = nro_consultor;
    }
    
    
    
    
    
}
