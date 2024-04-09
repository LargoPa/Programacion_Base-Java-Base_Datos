
package logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
            
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataque Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataque Pistola Agua");
    }
    
    
    
}
