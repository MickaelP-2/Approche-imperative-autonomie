package fr.algorithmie;

import java.util.Scanner;//Pour utiliser la fonction Scanner

public class AffichageIdentite {
	/**
	 * Claas equi doit afficher 10 fois l'identite
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utiliser une boucle for pour afficher 10 fois l'identite
		String nom=null,prenom=null;//Pour les noms et prenoms saisis
		System.out.println("Entrer votre nom: ");
		Scanner scan = new Scanner(System.in);//creation du flux de lecture dans la lecture
		nom = scan.nextLine();
		System.out.println("Entrer votre prénom; ");
		prenom = scan.nextLine();//fermeture du flux de lecture  dans la console
		scan.close();
		//System.out.println("->"+nom+" "+prenom);ligne pour verifier la saisie
		for(int i =0; i<10;i++) {//Pour afficher 10 fois les saisies (de 0 à 9 car i<10)
			System.out.println(" "+(i+1)+" "+nom+" "+prenom);
		}//fin for()

	}//fin main()

}//fin classe AffichageIdentite()
