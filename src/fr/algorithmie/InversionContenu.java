package fr.algorithmie;

public class InversionContenu {
	/**
	 * Créer une classe InversionContenu
	 * Créer un tableau array de type int
	 * Crééer un tableau arrayCopy et copier les elements du tableau array dans arrayCopy dans l'ordre inverse
	 * Afficher l'ensemble des deux tableaux
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};//tableau array[] de type int
		int arrayCopy[] = new int[array.length];//tableau arrayCopy
		
		int j = array.length;//indice de arrayCopy a décrémenter
		for(int i=0;i<(array.length);i++) {
				j--;
				arrayCopy[j] = array[i];//copie des valeurs 
		}//fin for() lecture du tableau array
		
		for(int i=0;i<arrayCopy.length;i++) {
			System.out.println(arrayCopy[i]+" "+array[i]);//affichage de l'ensemble des deux tableaux
		}//fin for()
	}//fin main()

}//fin Classe()
