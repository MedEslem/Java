package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Food.food;
import tn.esprit.gestionzoo.interfaces.Carnivore;
public abstract class Aquatique extends  Animal implements Carnivore<food>{


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
    public abstract void swim();
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatique aquatic = (Aquatique) obj;
        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.getHabitat().equals(aquatic.getHabitat());
    }
}
