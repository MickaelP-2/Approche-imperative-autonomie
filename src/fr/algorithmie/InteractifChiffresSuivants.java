package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	/**
	 * Créer une Classe InteractifChiffresSuivants
	 * Ecrire un programme qui demande à 'l'utilisateur de saisir un nombre ,puis qui
	 * affiche les 10 chiffres suivants
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//Pour declarer un flux de lecture, initialisé dans la console
		int nombre = 0;//declaration et initialisation de la variable nombre pour evaluer la saisie de l'utilisateur
		System.out.print("Saisir un nombre: ");
		nombre = scan.nextInt();//Pour saisir la valeur de l'utilisateur
		scan.close();//Pour fermer le flux de lecture dans la console
		//affiche un message et le nombre saisi
		for (int i=1;i<=10;i++) {
			System.out.print((nombre+i)+", ");
		}//fin for()
	}//fin main()

}//fin Classe()
