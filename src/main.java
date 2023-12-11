import entities.*;
import interfaces.*;
public class main {

    public static void main(String[] args) {
        //Prosit 9
       /* SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Mohamed", "Amine", "IT", 5);
        Employe e2 = new Employe(2, "Ali", "Yassine", "RH", 4);
        Employe e3 = new Employe(3, "Sami", "Aziz", "Comptabilité", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.displayEmploye();


        boolean trouve = societe.rechercherEmploye("Mohamed");
        System.out.println("L'employé 'Mohamed' a été trouvé : " + trouve);

        societe.supprimerEmploye(e2);

        societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        //Prosit9
        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(5, "A1", 25));
        D.ajouterDepartement(new Departement(2, "A2", 28));
        D.ajouterDepartement(new Departement(8, "A26", 32));
        D.displayDepartement();
        System.out.println(D.rechercherDepartement("J24"));
        System.out.println(D.trierDepartementById()); //It works fine
*/
        //Prosit10
        AffectationHashMap AHM = new AffectationHashMap();
        Employe e1 = new Employe(1, "Mohamed", "Amine", "IT", 5);
        Employe e2 = new Employe(2, "Ali", "Yassine", "RH", 4);
        Employe e3 = new Employe(3, "Sami", "Aziz", "Comptabilité", 3);
        Departement d1 = new Departement(5, "A1", 25);
        Departement d2 = new Departement(2, "J2", 28);

        AHM.ajouterEmployeDepartement(e1, d1);
        AHM.ajouterEmployeDepartement(e2, d1);
        AHM.ajouterEmployeDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements();

        AHM.supprimerEmploye(e2);
        AHM.afficherEmployes();
        AHM.afficherDepartments();
        System.out.println(AHM.rechercherEmploye(e2));
        System.out.println(AHM.rechercherDepartement(d1));
        System.out.println(AHM.trierMap());
        AHM.supprimerEmployeEtDepartement(e3, d2);
        AHM.afficherEmployesEtDepartements();
    }
}

