package fr.algorithmie;
	/**
	 * créer une classe CalculMoyenne
	 * Soit le tableau suivant: int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
	 * Quelle est la moyenne des éléments du tableau
	 */
public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		float somme_totale = 0f;//Pour calculer la somme cumulée des elements-> type float(réel)
		for(int i=0;i<array.length;i++) {
			somme_totale = somme_totale+array[i];//Calcul de la somme totale
		}//fin boucle for pour lire les éléments du tableau et calculer la somme totale
		float moyenne = (somme_totale/(array.length));//calcul de la moyenne de type float
		//affichage de la moyenne
		System.out.println(somme_totale+" "+array.length);
		System.out.println("La moyenne des valeurs de array est : "+moyenne);
	}//fin main()

}//fin Classe calculMoyenne()
