package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
	/**
	 * Créer une classe InteractifSommeArithmetique.
	 * Ecrire un programme qui demande un nombre a l'utilisateur puis calcul la somme
	 * des entiers entre 1 et ce nombre
	 * ex: Si l'utilisateur entre 5 la réponse est 15
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//Pour declarer un flux de lecture, initialisé dans la console
		int nombre = 0;//declaration et initialisation de la variable nombre pour evaluer la saisie de l'utilisateur
		int somme = 0;//Pour calculer la somme des nombres
		System.out.print("Saisir un nombre: ");
		nombre = scan.nextInt();//Pour saisir la valeur de l'utilisateur
		scan.close();//Pour fermer le flux de lecture dans la console
		//affiche un message et le nombre saisi
		for (int i=1;i<=nombre;i++) {//boucle pour utiliser l'indice i pour représenter les valeurs avant le nombre saisi
			somme = somme+i;//la somme est augmentée de la valeur de i(nombres entiers)
		}//fin for()
		System.out.print("La somme est de: "+somme);
	}//fin main()

}//fin Classe()
