package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Food.food;
import tn.esprit.gestionzoo.interfaces.*;

public class Pingouin extends  Aquatique{
    protected float swimmingDepth;
    public Pingouin(){

    }
    public Pingouin(String family, String name, int age, boolean isMammal,String Habitat,float SD){
    super(family, name, age, isMammal,Habitat);
    this.swimmingDepth=SD;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("Le pingouin nage en battant des ailes.");
    }

    @Override
    public void eatMeat(food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);
    }

}
