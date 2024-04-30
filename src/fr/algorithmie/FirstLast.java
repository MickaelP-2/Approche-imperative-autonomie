package fr.algorithmie;

public class FirstLast {
	/**
	 * Créer une classe FirstLast
	 * Déclarer un tableau d'entiers
	 * Déclarer une variable de type boolean 
	 * elle vaut true si le tableaux est de longueur supérieure ou egale à 1 et que le premier et dernier chiffre soient les mêmes 
	 * sinon elle vaut false
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] tab = null;//Pour déclarer le tableau val==false(pas d'éléments)-> exception=null
		//int[] tab = {6};//1 valeur fin==debut -> val=true
		//int[] tab = {0,-4,7,9};//4 valeurs mais début != fin -> val=false
		//int[] tab = {0,-4,7,6,3};//5 valeurs et debut != fin -> val=false
		//int[] tab = {9,7,9};//3 valeurs et debut == fin -> val=true
		//int[] tab = {6,-4,7,9};//4 valeurs, debut != fin -> val=false
		int[] tab = {0,0,0};//3 valeurs et fin == debut -> val = true
		boolean val = false;//valeur par defaut de val, declaration et initialisation
		if(tab.length>=1 && (tab[0] == tab[tab.length-1])) {
			//vérification des valeurs: taille>=1 et valeur de début == valeur de fin
			val = true;
		}//fin if
		else val = false;
		System.out.println("affichage de la variable boolean: "+val);
	}//fin main()

}//fin Classe FirstLast()
