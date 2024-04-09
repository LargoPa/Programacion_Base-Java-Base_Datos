
package logica;


public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
        
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur ataque Paralizar");
    }
        
}
