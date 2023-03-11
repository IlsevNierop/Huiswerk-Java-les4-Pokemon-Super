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
        System.out.println(" check health points before " + a.getHp());
        System.out.println(this.getName() + this.getAttack() + "  and causes damage to " + a.getName());

        a.setHp((a.getHp() - 5));

        System.out.println(a.getName() + " now has " + a.getHp() + " health points.");

    }
}
