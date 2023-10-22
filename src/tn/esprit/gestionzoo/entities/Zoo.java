package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;

    public Aquatique[] aquaticAnimals;


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
        aquaticAnimals = new Aquatique[10];
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
    public void addAquaticAnimal(Aquatique aquatic) {
        int i = 0;
        while (i < 10) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Aquatic animal added successfully.");
                return;
            }
            i++;
        }
        System.out.println("Aquatic Animals capacity is full.");
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatique animal : aquaticAnimals) {
            if (animal instanceof Pingouin) {
                Pingouin penguin = (Pingouin) animal;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatique animal : aquaticAnimals) {
            if (animal instanceof Dauphin) {
                dolphinCount++;
            } else if (animal instanceof Pingouin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }
}
