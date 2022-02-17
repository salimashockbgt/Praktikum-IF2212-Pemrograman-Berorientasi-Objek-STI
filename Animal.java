//Salimatussholati A 18220054
public abstract class Animal implements HavePower{
    private int rawPower;
    private String habitat;
    public Animal(int rawPower, String habitat){
        this.rawPower = rawPower;
        this.habitat = habitat;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public int getRawPower() {
        return this.rawPower;
    }
    public boolean isStrongerThan(HavePower comp){
        if (this.rawPower > comp.getRawPower()) {
            return true;
        }
        else {
            return false;
        }
    }
    public void fight(Animal anm){
        if ((rawPower > anm.getRawPower()) && (this.habitat == anm.getHabitat())) {
            rawPower = rawPower + anm.getRawPower();
        }

    }
    public abstract void speak();
}
