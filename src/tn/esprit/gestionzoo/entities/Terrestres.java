package tn.esprit.gestionzoo.entities;

public class Terrestres extends  Animal{
    protected int nbrLegs;

    public Terrestres(){

    }
    public Terrestres(String family, String name, int age, boolean isMammal,String Habitat,int nbrL){
    super(family, name, age, isMammal);
    this.nbrLegs=nbrL;}

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}