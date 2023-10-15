package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    private final int nbrCages = 25;
    private int nbrAnimals;


    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    public boolean addAnimal(Animal animal , Zoo Z) {
        if (searchAnimal(animal) != -1)
            return false;
        if (ZooisFull(Z)== true)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        String N= animal.getName();
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            String A= animals[i].getName();
            if (N == A)
                return i;
        }
        return index;
    }
    public boolean ZooisFull(Zoo Z){
        if(Z.nbrAnimals < Z.nbrCages){
             System.out.println("You can Add another animal");
             return false;
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo is FULL");
            return true;
        }
    }
    public Zoo ComparerZoo (Zoo Z1,Zoo Z2){
        if(Z1.nbrAnimals < Z2.nbrAnimals){
            System.out.println(Z2.name+" "+"has more Animals than"+Z1.name);
            return Z2;
        }
    else{            System.out.println(Z1.name+" "+"has more Animals than"+Z2.name);
            return Z1;
        }
    }



    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }
}
