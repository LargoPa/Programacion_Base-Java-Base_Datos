
package logica;


public abstract class Pokemon {
    
    protected int nroPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;    
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
}
