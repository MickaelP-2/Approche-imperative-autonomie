package fr.algorithmie;


public class ComparaisonTableau {
	/**
	 * Créer  une classe ComparaisonTableaux
	 * soit le staleaux suivants:  int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
	 * soit le staleaux suivants:  int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
	 * Ecrire le code pouvant compter le nombre  d'élements communs des deux tableaux
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int compte =0;//pour la variable du compteur d'éléments communs
		for(int i=0;i<array1.length;i++) {
			//premiere boucle for pour passer en revue les elements de array1
			for(int j=0;j<array2.length;j++) {
				//seconde boucle pour comparer les elements de array2
				if(array1[i] == array2[j]) {
					compte++;
					//System.out.println("valeur: "+array1[i]);pour afficher les valeurs communes
				}//fin if()
			}//fin for(j...)
		}//fin for(i...)
		System.out.println("\nLes deux tableaux ont "+compte+" éléments en commun!");
	}//fin main()

}//fin Classe()
