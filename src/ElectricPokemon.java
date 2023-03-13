package src;

public class ElectricPokemon extends PokemonSuper{

    private int voltage;

    private String locationFlowCurrent;

    public ElectricPokemon(String name, int hp, int level, int xp, String attack, String defence, double height, double weight, int voltage, String locationFlowCurrent) {
        super(name, hp, level, xp, attack, defence, height, weight);
        this.voltage = voltage;
        this.locationFlowCurrent = locationFlowCurrent;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getLocationFlowCurrent() {
        return locationFlowCurrent;
    }

    public void setLocationFlowCurrent(String locationFlowCurrent) {
        this.locationFlowCurrent = locationFlowCurrent;
    }


    @Override
    void pound(PokemonSuper a) {
        System.out.println("check health points before " + a.getHp());
        System.out.println(this.getName() + this.getAttack() + " and causes damage to " + a.getName());

        a.setHp((a.getHp() - 3));

        System.out.println(a.getName() + " now has " + a.getHp() + " health points.");
    }

     public void thunderPunch(PokemonSuper b){
        System.out.println(this.getName() + " punches " + b.getName() + " with his thunder.");
        System.out.println(b.getName() + b.getDefence() + ".");


        if (this.getLevel() >= b.getLevel()){
            System.out.println("Unfortunately, " + b.getName() + " is not strong enough for " + this.getName() + ".");
            if (this.getXp() >= b.getXp()){
                b.setHp(b.getHp() - 8);
                this.setXp(this.getXp() + 3);
                System.out.println(b.getName() + " lost 8 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " gained experience points. He now has: " + this.getXp() );

            }
            else {
                b.setHp(b.getHp() - 2);
                this.setHp(this.getHp() -1);
                System.out.println(b.getName() + " and " + this.getName() + " get into a fight. They lose some and none win some.");
                System.out.println(b.getName() + " lost 2 health points. His current HPs are: " + b.getHp() + ".");
                System.out.println(this.getName() + " lost 1 health point. His current HPs are: " + this.getHp() + ".");
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

    public void electroBall(PokemonSuper c){
        System.out.println(this.getName() + " throws an electro ball at " + c.getName() + ".");
        if (c.getXp() >= 0){
            c.setXp(c.getXp() - 1);
            this.setXp(this.getXp() + 1);
        }
        System.out.println("The new experience points are: \n" + this.getName() + " " + this.getXp() + "\n" + c.getName() + " " + c.getXp());

    }

}
