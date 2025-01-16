package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        // TABLEAUX 1 A 10
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // PREMIER ELEMENT TABLEAUX
        System.out.println("Premier élément du tableau : " + tableau[0]);

        // LONGEUR TABLEAUX
        System.out.println("Longueur du tableau : " + tableau.length);

        // DERNIERS ELEMENT TABLEAUX
        System.out.println("Dernier élément du tableau : " + tableau[tableau.length - 1]);

        // MODIFICATION INDEX 4 ET DONNE 8
        tableau[4] = 8;
        System.out.println("Nouvelle valeur de l'élément d'index 4 : " + tableau[4]);
    }
}
