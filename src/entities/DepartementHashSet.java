package entities;
import interfaces.IDepartement;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> Dep= new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        Dep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d :Dep ){
            if (d.getNom().equals(nom))
                return true;}
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        boolean T=Dep.contains(departement);
        return T;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
    Dep.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = Dep.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());}
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> TreeDep=new TreeSet<>(Dep);
        return TreeDep;
    }
}
