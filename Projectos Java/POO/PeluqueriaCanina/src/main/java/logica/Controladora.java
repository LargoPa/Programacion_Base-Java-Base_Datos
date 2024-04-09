
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atencionEspecial, 
            String nombreDuenio, String celDuenio) {
        
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();        
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,mascota);
                        
    }

    public List<Mascota> traerMascotas() {                     
        
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_cliente) {
        
        controlPersis.borrarMascota(num_cliente);
        
    }

    public void borrarDuenio(int num_cliente) {
        controlPersis.borrarDuenio(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        
        return controlPersis.trearMascota(num_cliente);
        
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atencionEspecial, String nombreDuenio, String celDuenio) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencionEspecial);
        
        //modifico mascota
        controlPersis.modificarMascota(masco);
        
        //seteo nuevos valores de dueño
        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        //llamar al modificar dueño
        this.modificarDuenio(duenio);
        
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
    
    
    
}
