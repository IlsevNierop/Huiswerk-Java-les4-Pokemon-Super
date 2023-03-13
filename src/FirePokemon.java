package src;

public class FirePokemon extends PokemonSuper{

    private String locationFire;

    private int sizeFire;

    public FirePokemon(String name, int hp, int level, int xp, String attack, String defence, double height, double weight, String locationFire, int sizeFire) {
        super(name, hp, level, xp, attack, defence, height, weight);
        this.locationFire = locationFire;
        this.sizeFire = sizeFire;
    }

    public int getSizeFire() {
        return sizeFire;
    }

    public void setSizeFire(int sizeFire) {
        this.sizeFire = sizeFire;
    }

    public String getLocationFire() {
        return locationFire;
    }

    public void setLocationFire(String locationFire) {
        this.locationFire = locationFire;
    }



    @Override
    void pound(PokemonSuper a) {
        System.out.println(this.getName() + this.getAttack() + "  and causes damage to " + a.getName());

        a.setHp((a.getHp() - 5));

        System.out.println(a.getName() + " now has " + a.getHp() + " health points.");

    }

    public void pyroBall(PokemonSuper b){
        System.out.println(this.getName() + " woke up so angry today! He finds " + b.getName() + ". And decides to throw a pyro ball at him.");
        System.out.println("As defence, " + b.getName() + b.getDefence() + ".");

        if (this.getLevel() >= b.getLevel()){
            if (this.getXp() >= b.getXp()){
                System.out.println("Unfortunately, " + b.getName() + " is not strong enough and " + b.getName() + " looses the battle.");
                b.setHp(b.getHp() - 9);
                this.setXp(this.getXp() + 4);
                System.out.println(b.getName() + " lost 9 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " gained experience points. He now has: " + this.getXp() );

            }
            else {
                System.out.println("They have the same experience points, but not the same level. Therefore, both lose some and win some.");
                b.setHp(b.getHp() - 2);

                this.setHp(this.getHp() -2);
                System.out.println(b.getName() + " lost 2 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " lost 2 health points. His current HPs are: " + this.getHp() + ".");
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

    public void flameThrower(PokemonSuper c){
        System.out.println(this.getName() + " spits out flames from his " + this.getLocationFire() + ", with a size of: " + this.getSizeFire() + " towards " + c.getName() + ". He's overwhelmed and lights on fire.");
        if (c.getXp() >= 0){
            c.setXp(c.getXp() - 2);
            this.setXp(this.getXp() + 2);
        }
        System.out.println("The new experience points are: \n" + this.getName() + " " + this.getXp() + "\n" + c.getName() + " " + c.getXp());

    }
}
