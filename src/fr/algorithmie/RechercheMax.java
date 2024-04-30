package fr.algorithmie;

public class RechercheMax {
	/**
	 * Créer une classe RechercheMax
	 * Soit le tableau suivant: int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
	 * Rechercher le plus grand element du tableau
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int plus_grand = 0;//variable pour le nombre le plus grand du tableau
		for(int i=0;i<array.length;i++) {
			//boucle de traitement
			if(array[i]>plus_grand) {//test conditionnel pour evaluer la valeur du tableau et celle due la plus grande valeur 
				plus_grand = array[i];//copie de la valeur dans la variable plus_grand
			}//fin if()
		}//fin for()
		//affichage de la plus grande valeur du tableau
		System.out.print("La plus grande valeur de array est: "+plus_grand);
	}//fin main()

}//fin Classe RechercheMax()
