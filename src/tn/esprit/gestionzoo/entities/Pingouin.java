package tn.esprit.gestionzoo.entities;

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
}
