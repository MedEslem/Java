import entities.*;
import interfaces.IGestion;
public class main {

    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

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
    }
}

