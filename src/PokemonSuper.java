package src;

// Ik weet helemaal NIKS van pokemon - dus ik heb alles verzonnen. Slaat waarschijnlijk nergens op, maar hoop dat de code in ieder geval ergens op slaat :)
public abstract class PokemonSuper {
    private String name;
    private int hp = 80;

    private int level;

    private int xp = 0;

    //attack - is de move die de pokemon maakt bij attack
    private String attack;

    //defence - is de move die pokemon maakt bij defence
    private String defence;

    private double height;

    private double weight;


    public PokemonSuper(String name, int hp, int level, int xp, String attack, String defence, double height, double weight) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.xp = xp;
        this.attack = attack;
        this.defence = defence;
        this.height = height;
        this.weight = weight;
    }

    void speaks(String sound){
        System.out.println(this.getName() + " says " + sound);
    }

    void scratch(PokemonSuper a) {
       System.out.println("check hp a before scratch"+a.getHp());
        a.setHp((a.getHp()-1));

        System.out.println(this.getName() +" has just scratched "+ a.getName() + ". " + a.getName()+" now has "+a.getHp()+" health points.");
}


    abstract void pound(PokemonSuper a);

    public void eats(String food){
        System.out.println(this.getName() + " is eating " + food + ".");

    }

    public void recovers(){
        this.setHp(this.getHp() + 3);
        System.out.println(this.getName() + " is sleeping for 2 hours to recover from this stressful day. After this nice power nap, his health points are: " + this.getHp() + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
