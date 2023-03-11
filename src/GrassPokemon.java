package src;

public class GrassPokemon extends PokemonSuper {

    private int amountGrass;

    private String color;

    public GrassPokemon(String name, int hp, int level, int xp, String attack, String defence, double height, double weight, int amountGrass, String color) {
        super(name, hp, level, xp, attack, defence, height, weight);
        this.amountGrass = amountGrass;
        this.color = color;
    }

    public int getAmountGrass() {
        return amountGrass;
    }

    public void setAmountGrass(int amountGrass) {
        this.amountGrass = amountGrass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void speaks(String sound) {
        System.out.println(this.getName() + " doesn't have a voice.");

    }

    @Override
    void pound(PokemonSuper a) {
        System.out.println(" check health points before " + a.getHp());
        System.out.println(this.getName() + this.getAttack() + " and tries to cause damage to " + a.getName());
        System.out.println(a.getName() + a.getDefence() + " and doesn't get any damage done by " + this.getName());

    }
}
