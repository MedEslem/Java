package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);


        Zoo myZoo = new Zoo();
        myZoo.setAnimals(new Animal[25]);
        myZoo.setCity("Ariana");
        myZoo.setName("Wildlife Park");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal Ours = new Animal("QDD", "AESS", -5, true);
        Animal cat = new Animal("Cats", "Tom", 2, true);
/*        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        myZoo.addAnimal(lion, myZoo);
        myZoo.addAnimal(dog, myZoo);

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();



        //Instrunction 21
        Dauphin D = new Dauphin("Canine", "Snoopy", 2, true,"AEE4",1.45f);
        myZoo.addAquaticAnimal(D);
        Pingouin P =new Pingouin();
        Terrestres T =new Terrestres();
        myZoo.addAquaticAnimal(P);
*/

            try {
                myZoo.addAnimal(lion, myZoo);
                System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

                myZoo.addAnimal(dog, myZoo);
                System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

                myZoo.addAnimal(Ours, myZoo);
                System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());

                myZoo.addAnimal(cat, myZoo);
                System.out.println("Nombre d'animaux : " + myZoo.getNbrAnimals());
            } catch (ZooFullException e){
                System.out.println("Le zoo est plein : " + e.getMessage());
            }catch (InvalidAgeException A){
        System.out.println("Age est negative : " + A.getMessage());
        }

    }
    }



