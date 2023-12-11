package entities;

import java.util.*;

public class Departement implements Comparable<Departement> {

    int id;
    String nom;
    int nb_emplye;

    public Departement(int id, String nom, int nb_emplye) {
        this.id = id;
        this.nom = nom;
        this.nb_emplye = nb_emplye;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nb_emplye=" + nb_emplye +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
            int result = 17;
            result = result * 31 + id;
            result = result * 31 + nom.hashCode();
            return result;
    }

    public Departement(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb_emplye() {
        return nb_emplye;
    }

    public void setNb_emplye(int nb_emplye) {
        this.nb_emplye = nb_emplye;
    }
    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id);
    }

}
