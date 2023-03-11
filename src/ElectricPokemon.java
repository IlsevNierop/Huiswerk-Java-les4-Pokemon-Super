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
}
