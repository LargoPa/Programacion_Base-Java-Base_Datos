
package herencia;


public class Empleado extends Persona{
    
    int nro_legajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }
    
    public Empleado(int nro_legajo, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nro_legajo = nro_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNro_legajo() {
        return nro_legajo;
    }

    public void setNro_legajo(int nro_legajo) {
        this.nro_legajo = nro_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
}
