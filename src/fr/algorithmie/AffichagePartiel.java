package fr.algorithmie;

public class AffichagePartiel {
	/**
	 * Créer une classe AffichagePartiel
	 * Soit le tableau suivant int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4}
	 * Combiner une boucle et un test de manière a n'afficher que les entiers superieurs à 3
	 * Combiner une boucle et un test pour afficher les entiers pairs
	 * Combiner une boucle et un test pour afficher les index pairs
	 * Combiner une boucle et un test pour afficher les entiers impairs
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		for(int i =0;i<array.length;i++) {
			//afficher les entiers supérieurs à 3
			if(array[i]>3) {//test conditionnel pour evaluer si la valeur est supérieure à 3
				System.out.print(array[i]+" ");//affichage de la valeur>3
			}//fin if()
		}//fin for 
		System.out.println("\n");//pour passer à la ligne
		for(int i =0;i<array.length;i++) {
			//afficher les entiers pairs
			if(array[i]%2==0) {//test conditionnel sur la valeur de array
				System.out.print(array[i]+" ");//affichage des entiers pairs
			}//fin if()
		}//fin for
		System.out.println("\n");//pour passer à la ligne
		for(int i =0;i<array.length;i++) {
			//afficher les index pairs
			if(i%2==0) {//test conditionnel sur la valeur de l'index
				//System.out.println(array[i]+" "+i);//affichage des valeurs des indexs pairs 
				System.out.print(array[i]+" ");//affichage uniquement des valeurs des index pairs
			}//fin if()
		}//fin for
		System.out.println("\n");//pour passer à la ligne
		for(int i =0;i<array.length;i++) {
			//afficher les entiers impairs
			if(array[i]%2!=0) {//test conditionnel pour évaluer la valeur impaire
				System.out.print(array[i]+" ");//affichage des valeurs impaires
			}//fin if()
		}//fin for
	}//fin main()

}//fin Classe AffichagePartiel()
