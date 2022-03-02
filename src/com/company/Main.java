package com.company;

import bo.Tache;

public class Main {


    public static void main(String[] args) {

        java.util.Scanner keybd = new java.util.Scanner(System.in);
        Tache list = new Tache();

        int choix = 1;

        while (choix != 0) {
            //Afficher la liste
            System.out.println();
            System.out.println(list);

            //Le choix du menu
            System.out.println("MENU:");
            System.out.println("1 - Ajouter une tache");
            System.out.println("2 - Supprimer le dernier element");
            System.out.println("3 - Supprimer une tache precise");
            System.out.println("4 - Modifier une tache");
            System.out.println("0 - Quitter");
            System.out.print("Veuillez faire un choix: ");

            //Les processus en fonction des choix du menu
            try {
                choix = keybd.nextInt();
                keybd.nextLine();  // effacer l'entrer
                switch (choix) {
                    case 1:  //Ajouter
                        System.out.print("Veuillez saisir la tache à faire: ");
                        String tache = keybd.nextLine();
                        boolean added = list.ajouterTache(tache);
                        if (!added) {
                            System.out.println("Desole mais cette liste de tache est deja pleine☹️");
                        }
                        break;

                    case 2:  //REMOVE LAST
                        String removed = list.supprimerTache(list.getsize());
                        if (removed != null) {
                            System.out.println("Removed: " + removed);
                        }else {
                            System.out.println("La liste est deja vide🤥");
                        }
                        break;

                    case 3:  //Suppression precise
                        System.out.print("Saisir le numero de l'element a supprimer: ");
                        int index = keybd.nextInt();
                        removed = list.supprimerTache(2);
                        if (removed != null) {
                            System.out.println("Supprimer: " + removed);
                        }else {
                            System.out.println("il n'y a aucun numero associer a cette tache choisissez un autre numero " +
                                    index + ".");
                        }
                        break;

                    case 0:
                        System.out.println("Aurevoir👋🏽!");
                        break;

                    default:
                        System.out.println("Oups! " + choix + " ne fait pas " +
                                "parti du menu. Reessayer s'il vous plait.");
                        break;
                }
            }catch (java.util.InputMismatchException ime) {
                System.out.println("Desole mais vous devez entrer un chiffre 😤.");
                keybd.nextLine();
            }
        }//end while



    }


}
