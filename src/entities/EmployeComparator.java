package entities;

import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        // Comparaison par nom
        int compareNom = e1.getNom().compareTo(e2.getNom());
        if (compareNom != 0) {
            return compareNom;
        }

        // Comparaison par département
        int compareDepartement = e1.getNomDepartement().compareTo(e2.getNomDepartement());
        if (compareDepartement != 0) {
            return compareDepartement;
        }

        // Comparaison par grade
        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}
