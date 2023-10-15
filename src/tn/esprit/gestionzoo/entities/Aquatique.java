package tn.esprit.gestionzoo.entities;

public class Aquatique extends  Animal{


    protected String Habitat;

    public Aquatique(){

    }
    public Aquatique(String family, String name, int age, boolean isMammal,String H){
    super(family, name, age, isMammal);
    this.Habitat=H;
    }
    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }
}
