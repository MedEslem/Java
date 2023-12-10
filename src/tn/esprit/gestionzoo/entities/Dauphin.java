package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Food.food;
import tn.esprit.gestionzoo.interfaces.*;

public class Dauphin extends  Aquatique{
    protected float swimmingSpeed;
    public Dauphin(){

    }
    public Dauphin(String family, String name, int age, boolean isMammal,String Habitat,float SP){
        super(family, name, age, isMammal,Habitat);
        this.swimmingSpeed=SP;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("Le dauphin nage gracieusement.");
    }

    @Override
    public void eatMeat(food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);
    }

}
