package src;

public class PokemonMain {

    // Als een pokemon vecht - check wel type - een overruled de ander - check level - heeft ook invloed - en op basis daarvan wint een of niet. Als wint van level hoger - dan gaat automatisch level hoger. Bij elke win - krijgt xp - en na X xp's ook level hoger. Damage hangt af van verschil - hoeveel punten eraf. Weight heeft invloed op sommige methodes en Height ook invloed op sommige methodes
    public static void main(String[] args) {

        PokemonSuper e1 = new ElectricPokemon("Cresselia", 80, 0, 0, " does a little dance", " ducks", 10.5, 5.9, 4, "finger");

        GrassPokemon g1 = new GrassPokemon("Bounsweet", 80, 0, 0, " expels pollen", " expels dirty smell", 8.4, 3.9, 109, "blue");

        e1.eats("electrons");
        e1.pound(g1);
        e1.scratch(g1);
        e1.pound(g1);

    }
}
