package fr.algorithmie;

public class SommedeTableauxDiff {
	/**
	 * Créer une classe SommeDeTableauxDiff
	 * tableau 1:  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	 * tableau 2:  {-1, 12, 17, 14, 5, -9, 0, 18 } ;
	 * Créer un tableau qui contient la somme des 2 précédents tableaux
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}; 
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int longueur_array1 = array1.length;
		int longueur_array2 = array2.length;
		int[] array3 = new int[(longueur_array1+longueur_array2)];//new int [(longueur_array1+longueur_array2)];
		//**déclaration de array3 de taille (array1+array2)
		int indice = 0;//indice de array3
		for(int i=0;i<array1.length;i++) {
			array3[indice] = array1[i];
			indice++;//incrementation de l'indice de array3
		}
		//**System.out.println("indice: "+indice);pour verifier la valeur de l'indice de array3
		for(int i=0;i<array2.length;i++) {
			array3[indice] = array2[i];
			indice++;//incrementation de l'indice de array3, conservé
		}
		System.out.println("Valeurs de array3: \n");
		for (int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+" ");//affichage en ligne
		}//fin for()
		
	}//fin main()

}//fin Classe()
