package src;

public class WaterPokemon extends PokemonSuper{

    private int amountWater;

    private String colorEyes;

    public WaterPokemon(String name, int hp, int level, int xp, String attack, String defence, double height, double weight, int amountWater, String colorEyes) {
        super(name, hp, level, xp, attack, defence, height, weight);
        this.amountWater = amountWater;
        this.colorEyes = colorEyes;
    }

    public int getAmountWater() {
        return amountWater;
    }

    public void setAmountWater(int amountWater) {
        this.amountWater = amountWater;
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }



    @Override
    void scratch(PokemonSuper a) {
        System.out.println(this.getName() + " tries to scratch, but fails.");

    }

    @Override
    void pound(PokemonSuper a) {
        System.out.println("check health points before " + a.getHp());
        System.out.println(this.getName() + this.getAttack() + " and tries to cause damage to " + a.getName() + ".");
        this.setHp(this.getHp() - 2);
        System.out.println(a.getName() + a.getDefence() + " and doesn't get any damage done by " + this.getName() + "." + '\n' + a.getName() + " gets violent and" + a.getAttack() + ". " + this.getName() + " now has " + this.getHp() + " health points." );

    }
}
