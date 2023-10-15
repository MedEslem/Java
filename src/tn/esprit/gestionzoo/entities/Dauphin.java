package tn.esprit.gestionzoo.entities;


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
}
