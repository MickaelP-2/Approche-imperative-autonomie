package fr.algorithmie;

public class FirstLast6 {
	/**
	 * Créer une classe FirstLast6
	 * déclarer un tableau d'entiers
	 * calculer une valeur boolean qui controle le tableau:
	 * elle vaut true si le tableau à au mmoins un élément et si le premier élément vaut 6 ou si le dernier vaut 6
	 * elle retourne false dans les autres cas 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] tab = null;//Pour déclarer le tableau val==false(pas d'éléments)-> exception=null
		int[] tab = {6};//1 valeur fin=6,debut=6 -> val=true
		//int[] tab = {0,-4,7,9};//4 valeurs mais pas de 6 en debut ou fin -> val=false
		//int[] tab = {0,-4,7,6};//4 valeurs et 6 en fin -> val=true
		//int[] tab = {6,7,9};//3 valeurs et 6 en debut -> val=true
		//int[] tab = {6,-4,7,9};//4 valeurs 6 en debut -> val=true
		//int[] tab = {0,0,0};
		boolean val = false;//valeur par defaut de val
		if(tab.length>=1 && (tab[0]==6 || tab[tab.length-1]==6)) {
			//verification des valeurs: longueur>=1 et valeurs de début ou de fin ==6
			val = true;
		}//fin if
		else val = false;
		System.out.println("affichage de la variable boolean: "+val);
	}//fin main()

}//fin Classe()
