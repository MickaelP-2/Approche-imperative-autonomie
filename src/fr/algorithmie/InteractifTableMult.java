package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	/**
	 * Créer une classe InteractifTableMult
	 * Ecrire un programme qui demande un nombre à l'utilisateur qui doit être compris entre 1 t 10
	 * Si le nombre est compris entre 1 et 10, affocher la table de multiplication du nombre
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
				isNumeric=true;//Pour sortir de la boucle
			}//fin if()
			else isNumeric=false;
		}//fin de la boucle while()
		scan.close();//Pour fermer le flux de lecture dans la console
		System.out.println("\n Table de: "+nombre);//affiche un message et le nombre saisi
		for (int i=1;i<=10;i++) {
			System.out.println(" "+nombre+" * "+i+" = "+(nombre*i));
		}//fin for()
		
	}//fin main()

}//fin Classe()
