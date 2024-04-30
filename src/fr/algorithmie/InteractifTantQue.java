package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
	/**
	 * Créer une classe InteractifTantQue
	 * Ecrire un programme qui demande un nombre à l'utilisateur qui doit obligatoirement 
	 * être compris entre 1 et 10.
	 * tant que ce nombre n'est pas compris entre 1 et 10, le programme redemande un nombre à l'utilisateur
	 * Si le nombre est comprise entre 1 et 10, le programme l'affiche et se termine
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//Pour declarer un flux de lecture, initialisé dans la console
		boolean isNumeric = false;//pour indiquer la nature du nombre saisi par l'utilisateur
		int nombre = 0;//declaration et initialisation de la variable nombre pour evaluer la saisie de l'utilisateur
		while(isNumeric!=true) {
			System.out.print("Saisir un nombre: ");
			nombre = scan.nextInt();//Pour saisir la valeur de l'utilisateur
			if(nombre>=1 && nombre<=10) {
				//test conditionnel pour l'encadrement du nombre saisi
				isNumeric = true;//Pour sortir de la boucle
			}//fin if()
			else isNumeric=false;
		}//fin de la boucle while()
		System.out.println("\n Le nombre est bien compris entre 1 et 10!\n Vous avez  saisi: "+nombre);
		scan.close();//Pour fermer le flux de lecture dans la console
	}//fin main()
}//fin Classe()
