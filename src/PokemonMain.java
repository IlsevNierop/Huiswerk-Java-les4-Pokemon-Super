package src;

public class PokemonMain {

    // Bonus 3: volgens mij kun je alleen 1 pokemon hebben met verschillende types - als de pokemon die eigenschappen inherit.
    // Dus in dit geval zou dan bijvoorbeeld de ElectricPokemon 'boven' de FirePokemon kunnen staan, en inherit de FirePokemon van de Electric. Op die manier zou de FirePokemon ook een ElectricPokemon zijn.
    // Zie hieronder bij e1 - deze is een PokemonSuper EN een ElectricPokemon.
    public static void main(String[] args) {

        PokemonSuper e1 = new ElectricPokemon("Cresselia", 80, 0, 0, " does a little dance", " ducks", 10.5, 5.9, 4, "finger");

        ElectricPokemon e2 = new ElectricPokemon("Shaneenee", 80, 0, 0, " does a little jump", " waves her arms", 8.3, 5.2, 2, "elbow");

        GrassPokemon g1 = new GrassPokemon("Bounsweet", 80, 0, 0, " expels pollen", " expels dirty smell", 8.4, 3.9, 109, "blue");

        WaterPokemon w1 = new WaterPokemon("Latias", 80, 0, 0, " creates a Tsunami", " throws water back", 7.5, 5.2, 83, "black");

        FirePokemon f1 = new FirePokemon("Tsareena", 80, 0, 0, " spits out fire", " ignites a lucifer", 10.3, 2.8, "mouth", 25);

        e1.eats("electrons");
        e1.pound(g1);
        e1.scratch(g1);
        e1.pound(g1);

        w1.pound(e1);

        f1.scratch(w1);

        //moet hem zo aanroepen - want hij is gedeclareerd (zie boven) als PokemonSuper en niet als ElectricPokemon
        ((ElectricPokemon)e1).thunderPunch(f1);

        //e2 is wel als ElectricPokemon gedeclareerd, dus dan kan het wel zo:
        e2.thunderPunch(w1);

        e1.recovers();

        g1.leafStorm(e1);

        w1.recovers();

        e2.electroBall(w1);

        g1.leechSeed(f1);

        w1.rainDance(e1);

        w1.surf(g1);

        e1.recovers();

        f1.flameThrower(g1);

        g1.recovers();

        f1.pyroBall(e2);








    }
}
