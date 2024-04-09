
package logica;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
        
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu ataque Puño Trueno");
    }
    
    
    
}
