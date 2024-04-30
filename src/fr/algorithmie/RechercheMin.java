package fr.algorithmie;

public class RechercheMin {
	/**
	 * Créer une classe RechercheMin
	 * Soit le tableau suivant:  int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
	 * Rechercher le plus petit élément du tableau
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int plus_petit=0;//valeur pour le nombre le plus petit
		for(int i=0;i<array.length;i++) {//boucle for pour la lecture du tableau array
			if(array[i]<plus_petit){//test conditionnel pour comparer la valeur du tableau et la plus petite
				plus_petit = array[i];//copie de la valeur la plus petite
			}//fin if()
		}//fin boucle for()
		System.out.println("Le plus petit nombre est: "+plus_petit);//affichage du resultat
	}//fin main()

}//Classe recherMin()
