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
        System.out.println(this.getName() + this.getAttack() + " and tries to cause damage to " + a.getName() + ".");
        this.setHp(this.getHp() - 2);
        System.out.println(a.getName() + a.getDefence() + " and doesn't get any damage done by " + this.getName() + "." + '\n' + a.getName() + " gets violent and" + a.getAttack() + ". " + this.getName() + " now has " + this.getHp() + " health points." );

    }

    public void rainDance(PokemonSuper b){
        System.out.println("It's been so warm the last weeks. " + this.getName() + " thinks it's time for some rain, and attacks " + b.getName() + " with a raindance.");
        System.out.println("As defence, " + b.getName() + b.getDefence() + ".");

        if (this.getLevel() >= b.getLevel()){
            if (this.getXp() >= b.getXp()){
                System.out.println("Unfortunately, " + b.getName() + " is not strong enough and " + b.getName() + " looses the battle.");
                b.setHp(b.getHp() - 10);
                this.setXp(this.getXp() + 4);
                System.out.println(b.getName() + " lost 10 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " gained experience points. He now has: " + this.getXp() );

            }
            else {
                System.out.println("They have the same experience points, but not the same level. Therefore, both lose some and win some.");
                b.setHp(b.getHp() - 1);

                this.setHp(this.getHp() -3);
                System.out.println(b.getName() + " lost 1 health point. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " lost 3 health points. His current HPs are: " + this.getHp() + ".");
            }
        }
        else {
            this.setHp(this.getHp() - 5);
            b.setXp(b.getXp() + 1);
            System.out.println("The opponent with " + b.getDefence() + " is too strong, " + this.getName() + " lost.");
        }

        if (b.getHp() <= 0){
            System.out.println(b.getName() + " is dead.");
        }
        if (this.getHp() <= 0) {
            System.out.println(this.getName() + " is dead.");
        }
    }

    public void surf(PokemonSuper c){
        System.out.println(this.getName() + " surfs over " + c.getName() + ". He cannot swim away soon enough and is pushed under water.");
        if (c.getXp() >= 0){
            c.setXp(c.getXp() - 1);
            this.setXp(this.getXp() + 1);
        }
        System.out.println("The new experience points are: \n" + this.getName() + " " + this.getXp() + "\n" + c.getName() + " " + c.getXp());

    }
}
