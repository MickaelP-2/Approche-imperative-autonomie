package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
	/**
	 * Créer une classe InteractifStockageNombre
	 * faire un programme avec le menu suivant:
	 * 1: Ajouter un nombre
	 * 2: Afficher les nombres éxistants
	 * Demander à l'utilisateur de saisir un choix
	 * 1: le programme demande la saisie d'un nombre et l'ajoute à un tableau.
	 * 2: le programme affiche le tableau
	 * Si le tableau est plein, ecrire l'algorithme qui permet d'augmenter sa tzaille
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//Pour declarer un flux de lecture, initialisé dans la console
		int choix_utilisateur = 0;//pour indiquer le nombre de valeurs saisies par l'utilisateur
		int nombre = 0;//declaration et initialisation de la variable nombre pour evaluer la saisie de l'utilisateur
		boolean arretSaisie = false;//Pour la sortie de la boucle de saisie
		int[] tab = new int[1];//tableau pour stocker les valeurs 
		System.out.println("***************************\n* Saisir une action:      *\n* Ajouter un nombre:    1 *\n* Afficher les nombres: 2 *\n***************************");
		choix_utilisateur = scan.nextInt();//Pour saisir le choix de l'utilisateur
		while(arretSaisie!=true) {
			//Pour inclure les saisies de l'utilisateur dans une boucle while
			System.out.println("***************************\n* Saisir une action:      *\n* Ajouter un nombre:    1 *\n* Afficher les nombres: 2 *\n***************************");
			switch(choix_utilisateur){
				case 1 :{
					//while(arretSaisie!=true) {
						System.out.println("Saisir une valeur: ");
						nombre = scan.nextInt();//Pour saisir la valeur
						tab[tab.length-1] = nombre;//affectation de la valeur au tableau
						tab = Arrays.copyOf(tab, tab.length+1);//pour augmanter la taille du tableau a chaque saisie
							//tab[tab.length-1] = nombre;//affectation de la valeur au tableau
							
					//}//fin while()
				}//fin case 1
				break;//Pour sortir de la selection du choix utilisateur
				case 2 :{
					arretSaisie = true;
					System.out.println("Affichage du tableau de nombres: "+(tab.length-1)+" valeurs!\n");
					for(int i=0;i<tab.length-1;i++) {
						System.out.print(" "+tab[i]);
					}//fin for()
				}//fin case 2
				break;//Pour sortir de la selection du choix utilisateur
				default :{
					System.out.println("Choix non traité!!");
				}//fin default
				break;//Pour sortir de la selection du choix utilisateur
			}//fin switch()
			choix_utilisateur = scan.nextInt();//Pour saisir le choix de l'utilisateur en dehors de la boucle while
		}//fin boucle while(arretsaisie!=true)
		scan.close();//Pour fermer le flux de lecture dans la console
	}//fin main()

}//fin Classe()
