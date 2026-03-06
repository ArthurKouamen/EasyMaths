package application;


/** Ceci est une minie application qui aidera
 * l'utilisateur à effectuer certains
 * calculs mathématique
 * application codée par
 * @author : Arthuro Synthé
 * @version 1.0
 */

import java.util.Scanner;

public class Calculatrice {

    //debut du programme

    //declaration des variables globales afin de ne pas les réécrire à chaque fois dans le programme
        static double premierNombre = 0;
        static double secondNombre = 0;
        static double resultat = 0;
        static Scanner sc = new Scanner(System.in);
        static int choix;

   

    public static void corpsDuProgramme() {
        
        //declaration de la variable locale choix qui va stoquer le choix de l'utilisateur
        
        
        System.out.println("*******************************************************************************************");
        System.out.println("*****                                                                                 *****");
        System.out.println("*****     Vous etes sur CALCULATRICE l'application qui revolutionne vos calculs       *****");
        System.out.println("*****                                                                                 *****");
        System.out.println("*******************************************************************************************");

        System.out.println();
        System.out.println("Quel est votre nom s'ils vous plait ?");
        String nom = sc.nextLine();
        System.out.println("Salut " + nom + " comment puis-je t'aider ?");
        
            
        do {
            System.out.println("*****Souhaite tu faire autre chose ?*****");
            //differents choix possibles
            System.out.println("1. Je veux faire une addition");
            System.out.println("2. Je veux faire une soustraction");
            System.out.println("3. Je veux faire une multiplication");
            System.out.println("4. Je veux faire une division");
            System.out.println("5. Je veux trier des élements");
            System.out.println("6. Quitter");
            System.out.print("votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();//pour nettoyer le buffer

            //conditions à remplir âprès le choix de l'utilisateur
            switch (choix) {
                case 1:
                    addition();
                    break;

                case 2:
                    soustraction();
                    break;

                case 3:
                    multiplication();
                    break;

                case 4:
                    division();
                    break;

                case 5:
                    tri(sc);
                    break;
                case 6:
                    System.out.println("***************************************************************************");
                    System.out.println("*                                                                         *");
                    System.out.println(   "* " + nom +" Merci d'avoir utilisé l'application CALCULATRICE et AUREVOIR  *");
                    System.out.println("*                                                                         *");
                    System.out.println("***************************************************************************");
                    break;

                default:
                    System.out.println("******************************");
                    System.out.println("**** ERREUR **** Mauvais choix *");
                    System.out.println("******************************");
                    System.out.println();
                    System.out.println("Veuillez choisir un nombre parmis ceux qui sont proposé");
                    System.out.println();
            }
        } while (choix != 6);

        sc.close();
    }

    //fonction addition qui sera appellée dans la fonction principale
    public static void addition() {

            //demander le nombre d'element
        System.out.println("Combien de nombre souhaitez vous calculer ?");
        int nombreElements = sc.nextInt(); //recuperer la valeur

            //création du tableau en question
        double[] tableau = new double[nombreElements];

            //remplissage du tableau
        for( int i = 0; i < nombreElements; i++){
            System.out.println("Veuillez entrer l'élement " + (i + 1) + " s'ils vous plaît !!!");
            tableau[i] = sc.nextDouble();
        }

            //calcul des nombres
        for(int i = 0; i < nombreElements; i++){
            resultat += tableau[i];
        }

            //Affichage du résultat
        System.out.println("le résultat de votre calcul après l'addition est est : " + resultat);
        resultat = 0;
    }

    //fonction soustraction qui sera appellée dans la fonction principale
    public static void soustraction() {

         //demander le nombre d'element
        System.out.println("Combien de nombre souhaitez vous calculer ?");
        int nombreElements = sc.nextInt(); //recuperer la valeur

            //création du tableau en question
        double[] tableau = new double[nombreElements];

            //remplissage du tableau
        for( int i = 0; i < nombreElements; i++){
            System.out.println("Veuillez entrer l'élement " + (i + 1) + " s'ils vous plaît !!!");
            tableau[i] = sc.nextDouble();
        }

            //calcul des nombres
            resultat = tableau[0];
        for(int i = 1; i < nombreElements; i++)
            resultat -= tableau[i];

            //Affichage du résultat
        System.out.println("le résultat de votre calcul après la soustraction est est : " + resultat);
        resultat = 0;
        
    }

    //fonction multiplication qui sera appellée dans la fonction principale
    public static void multiplication() {

        //demander le nombre d'element
        System.out.println("Combien de nombre souhaitez vous calculer ?");
        int nombreElements = sc.nextInt(); //recuperer la valeur

            //création du tableau en question
        double[] tableau = new double[nombreElements];

            //remplissage du tableau
        for( int i = 0; i < nombreElements; i++){
            System.out.println("Veuillez entrer l'élement " + (i + 1) + " s'ils vous plaît !!!");
            tableau[i] = sc.nextDouble();
        }

            //calcul des nombres
            resultat = tableau[0];
        for(int i = 0; i < nombreElements; i++)
            resultat *= tableau[i];

            //Affichage du résultat
        System.out.println("le résultat de votre calcul après la multiplication est : " + resultat);
        resultat = 0;
    }

    //fonction division qui sera appellée dans la fonction principale
    public static void division() {
        System.out.println("Veuillez entrer le dividende s'ils vous plaît !!!");
        premierNombre = sc.nextDouble();
        System.out.println("Veuillez à présent entrer le diviseur de votre nombre");
        secondNombre = sc.nextDouble();
        resultat = premierNombre / secondNombre;
        System.out.println("le résultat de votre calcul après la division est est : " + resultat);
    }

    //fonction tri qui sevira a choisir le tri souhaité
    public static void tri(Scanner sc) {
        int choix = 0;
        String nom = sc.nextLine();
        System.out.println("Quel type de tri souhaitez vous faire ?");

            do {
                System.out.println("1. je souhaite faire un tri bulle");
                System.out.println("2. je souhaite faire un tri selection");
                System.out.println("3. je souhaite faire un tri insertion");
                System.out.println("4. je souhaite faire un tri par tas");
                System.out.println("5. je souhaite faire un tri rapide");
                System.out.println("6. je souhaite faire un tri fusion");
                System.out.println("7. Retour à l'acceuil");
                System.out.println("8. Quitter");
                choix = sc.nextInt();
                sc.nextLine();//pour nettoyer le buffer
                System.out.println("votre choix");



                switch (choix) {
                    case 1:
                        System.out.println("trie");
                        triBulle();
                        break;

                    case 2:
                        triSelection();
                        break;

                    case 3:
                        triInsertion();
                        break;

                    case 4:
                        triParTas();
                        break;

                    case 5:
                        triRapide();
                        break;

                    case 6:
                        triFusion();
                        break;

                    case 7:
                        corpsDuProgramme();
                        break;

                    case 8:
                        System.out.println( nom +" Merci d'avoir utilisé l'application CALCULATRICE et AUREVOIR*******");
                        System.exit(0);
            
                    default:
                        System.out.println("****ERREUR**** Mauvais choix");
                        System.out.println("Veuillez choisir un nombre parmis ceux qui sont proposé");
                        break;
                }
            } while (choix != 7); 

            
            
        

    }

    //fonction tri Bulle
    public static void triBulle() {
        System.out.println("elements tries");
    }

    //fonction tri Sélection
    public static void triSelection() {
        
    }

    //fonction tri Insertion
    public static void triInsertion() {
        
    }

    //fonction tri par tas
    public static void triParTas() {
        
    }

     //fonction tri Rapide
     public static void triRapide() {
        
     }

      //fonction tri Fusion
    public static void triFusion() {
        
    }  
}
