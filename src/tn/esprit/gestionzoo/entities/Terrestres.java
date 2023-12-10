package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Food.food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestres extends Animal implements Omnivore<food> {

    private int nbrLegs;

    public Terrestres() {
    }

    public Terrestres(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }


    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);
    }


    @Override
    public void eatPlant(food plant) {
        System.out.println("The Terrestrial " + getName() + " is eating " + plant);

    }

    @Override
    public void eatMeatendPlant(food Food) {
        System.out.println("The Terrestrial " + getName() + " is eating " + Food);
    }
}
