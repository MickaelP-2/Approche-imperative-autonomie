package fr.algorithmie;


public class AffichageInverse {
	/**
	 * Créer une classeAffichageInverse
	 * Créer un tableau int array[] = {}
	 * Afficher l'ensemble des valeurs grâce à une boucle
	 * Afficher les elements dans l'ordre inverse
	 * Créer une tableau arrayCopy et copier les valeurs de array dans arrayCopy
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};//tableau array[] de type int
		//boucle for pour afficher les valeurs
		for (int i=0;i<array.length;i++) {
			//afficher les valeurs dans l'ordre
			System.out.println(array[i]);//affichage en colonne
			//System.out.print(" "+array[i]);//affichage en ligne
		}//fin for()
		//afficher dans l'ordre inverse
		System.out.println("\n array: "+array.length);
		for (int j=(array.length-1);j>0;j--) {
			//afficher les valeurs dans l'ordre inverse
			//System.out.println(array[i]);//affichage en colonne
			System.out.print(" "+array[j]);//affichage en ligne
		}//fin for()
		
		//créer un tableau arrayCopy et copier les valeurs de array dans arrayCopy
		
		//int arrayCopy[] = Arrays.copyOf(array, array.length);//Pour copier le tableau sans changer la longueur/taille
		int arrayCopy[] = new int[array.length];
		for (int i=0;i<array.length;i++) {
			arrayCopy[i] = array[i];
		}//fin for pour copier les valeurs dans arrayCopy
		
		for (int i=0;i<array.length;i++) {
			System.out.print(" "+arrayCopy[i]);
		}//fin for pour l'affichage de arrayCopy
	}//fin main()

}//Fin classe()
