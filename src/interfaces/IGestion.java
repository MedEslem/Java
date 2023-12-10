package interfaces;
public interface IGestion<T> {

    // Ajoute
    void ajouterEmploye(T t);

    // Recherche un employé par son nom
    boolean rechercherEmploye(String nom);

    // Recherche un employé par son identifiant
    boolean rechercherEmploye(T t);

    // Supprime un employé de la liste
    void supprimerEmploye(T t);

    // Affiche la liste des employés
    void displayEmploye();

    // Tri la liste des employés par ordre croissant de l'identifiant
    void trierEmployeParId();

    // Tri la liste des employés par ordre croissant du nom, du département et du grade
    void trierEmployeParNomDépartementEtGrade();
}
