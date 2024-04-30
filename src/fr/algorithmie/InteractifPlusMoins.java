package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
	/**
	 * Créer une classe interactifPlusMoins
	 * Ecrire un jeu qui:
	 * Choisi un nombre entre 1 et 100
	 * puis demande à l'utilisateur de trouver ce nombre en lui indiquant si le nb est plus grand ou plus petit
	 * Lorsque l'utilsiaetur à trouvé le nombre, afficher le nombre de coups et le message:
	 * "Bravo , vous avez trouvé en N coups!!", et terminer le programme.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//Pour declarer un flux de lecture, initialisé dans la console
		int nombre = (int)(Math.random()*100);//(int)Math.random()*100);//declaration et initialisation de la variable nombre
		//tirage du nombre aléatoire, entre 0 et 100(casté en type int)
		//**System.out.println("nombre: "+nombre);
		int N = 0;//Pour calculer la somme des nombres
		int nombre_saisi = 0;
		System.out.print("Saisir un nombre: ");
		while(nombre!=nombre_saisi) {
			//serie de tests conditionnels pour évaluer le nombre saisi et permettre d'afficher les indices
			// et sortir de la boucle while()
			nombre_saisi = scan.nextInt();//Pour saisir la valeur de l'utilisateur
			if(nombre_saisi<nombre) {
				System.out.println("Le nombre est plus grand!!");
				N++;
			}//fin if()
			else if(nombre_saisi>nombre) {
				System.out.println("Le nombre est plus petit!!");
				N++;
			}//fin else if()
		}//fin while()
		scan.close();//Pour fermer le flux de lecture dans la console
		//affiche un message et le nombre saisi
		
		System.out.print("Gagné!! Vous avez trouvé en "+N+" coups.");
	}//finmain()

}//fin classe()
