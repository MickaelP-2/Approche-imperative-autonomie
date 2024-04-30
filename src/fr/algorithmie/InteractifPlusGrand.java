package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	/**
	 * Créer une classe InteractifPlusGrand.
	 * Ecrire un programme qui demande à l'utilisateur de saisir 10 nombres et qui 
	 * retourne le plus grand.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//Pour declarer un flux de lecture, initialisé dans la console
		int nombreVal = 0;//pour indiquer le nombre de valeurs saisies par l'utilisateur
		int nombre = 0;//declaration et initialisation de la variable nombre pour evaluer la saisie de l'utilisateur
		int plus_grand = 0;
		System.out.println("Saisir 10 nombres.(Entrée pour valider chaque saisie.)");
		while(nombreVal<10) {
			nombre = scan.nextInt();//Pour saisir la valeur de l'utilisateur
			if(nombre>=plus_grand) {
				//test conditionnel pour l'encadrement du nombre saisi
				plus_grand = nombre;//Change la valeur du plus grand nombre saisi
			}//fin if()
			nombreVal++;
		}//fin de la boucle while()
		scan.close();//Pour fermer le flux de lecture dans la console
		System.out.println("Le plus grand nombre saisi est "+plus_grand);
	}//fin main()

}//fin Classe InteractifPlusGrand()
