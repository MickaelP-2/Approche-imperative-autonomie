package fr.algorithmie;

public class Rotation {
	/**
	 * Créer une classe Rotation
	 * déclarer un tableau d'entiers
	 * Effectuer une rotation à droite des éléments
	 * ex: {0,1,2,3} -> {3,0,1,2}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] tab = {0,1,2,3};
		//int tab[] = {4,2,1};
		int tab[] = {5,6,-2,8,11,-7};
		int[] tab2 = new int[tab.length];//Pour un tableau de même longeur
		//System.out.println("tab2[0]:"+tab2[0]);
		tab2[0] = tab[tab.length-1];//Pour conserver la valeur de fin 
		//System.out.println("tab2[0]:"+tab2[0]);
		for (int i=0;i<tab.length-1;i++) {
			//copie des valeurs apres rotation sans prendre en compte la derniere valeurs
			tab2[i+1] = tab[i];//Pour conserver la valeur de début[0]
		}//fin for()
		for(int i=0;i<tab2.length;i++) {
			//boucle pour afficher les valeurs du tableau
			System.out.print(tab2[i]+" ");
		}//fin for()
	}//fin main()

}//fin Classe Rotation()
