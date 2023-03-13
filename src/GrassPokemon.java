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

    public void leechSeed(PokemonSuper b){
        System.out.println(this.getName() + " has a lot of leeches in the grass. These leeches attack " + b.getName() + ".");
        System.out.println(b.getName() + b.getDefence() + ".");

        if (this.getLevel() >= b.getLevel()){
            System.out.println("Unfortunately, " + b.getName() + " is not strong enough and " + b.getName() + " looses the battle.");
            if (this.getXp() >= b.getXp()){
                b.setHp(b.getHp() - 14);
                this.setXp(this.getXp() + 5);
                System.out.println(b.getName() + " lost 14 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " gained experience points. He now has: " + this.getXp() );

            }
            else {
                b.setHp(b.getHp() - 2);
                this.setHp(this.getHp() -4);
                System.out.println(b.getName() + " and " + this.getName() + " get into a fight. They lose some and none win some.");
                System.out.println(b.getName() + " lost 2 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " lost 4 health points. His current HPs are: " + this.getHp() + ".");
            }
        }
        else {
            this.setHp(this.getHp() - 3);
            b.setXp(b.getHp() + 1);
            System.out.println("The opponent is too strong" + this.getName() + " lost.");
        }

        if (b.getHp() <= 0){
            System.out.println(b.getName() + " is dead.");
        }
        if (this.getHp() <= 0) {
            System.out.println(this.getName() + " is dead.");
        }
    }

    public void leafStorm(PokemonSuper c){
        System.out.println(this.getName() + " creates a tornado of leaves. " + c.getName() + " is in the middle of it. Oh noooo, what a mess.");
        if (c.getXp() >= 0){
            c.setXp(c.getXp() - 2);
            this.setXp(this.getXp() + 2);
        }
        System.out.println("The new experience points are: \n" + this.getName() + " " + this.getXp() + "\n" + c.getName() + " " + c.getXp());

    }
}
