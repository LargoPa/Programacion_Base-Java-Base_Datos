
package logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
        
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataque Puño Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander ataque Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataque Ascuas");
    }
    
    
    
}
