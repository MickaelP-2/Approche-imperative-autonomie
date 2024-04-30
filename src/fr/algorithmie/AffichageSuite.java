package fr.algorithmie;

import java.util.Scanner;//Pour utiliser la focnton Scanner

public class AffichageSuite {
	/**
	 * Utiliser une boucle for pour afficher les nombres de 1 à 10 inclus
	 * Utiliser une boucle for pour afficher les nombres pairs entre 0 à 10 inclus
	 * utiliser une boucle for pour afficher les nombres impairs entre 0 et 9 inclus
	 * Utiliser une boucle while pour afficher les nombres de 1 à 10 inclus
	 * Utiliser une boucle while pour afficher les nombres pairs entre 0 et 10 inclus
	 * Utiliser une boucle while pour afficher les nombres impairs entre 0 et 9 inclus
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//creation d'un flux de lecture dna sla console pour saisir l'exo souhaité
		int choix = 0;//Pour le choix de l'utilisateur
		System.out.println("***********************\n* Entrer votre choix: *\n***********************");
		System.out.println("Pour une boucle for pour afficher les nombres de 1 à 10: 1");
		System.out.println("Pour une boucle for pour afficher les nombres pairs de 0 à 10: 2");
		System.out.println("Pour une boucle for pour afficher les nombres impairs de 0 à 9: 3");
		System.out.println("Pour une boucle while pour afficher les nombres de 1 à 10(inclus): 4");
		System.out.println("Pour une boucle while pour afficher les nombres de 0 à 10(inclus): 5");
		System.out.println("Pour une boucle while pour afficher les nombres de 0 à 9(inclus): 6");
		choix = scan.nextInt();//attente de la saisie d'un nombre
		switch (choix) {
			case 1:{//debut du bloc d'instruction-> selection 1
				System.out.println("choix 1");
				for(int i=0;i<10;i++) {
					System.out.println(" "+(i+1));//indice i incrémenté dans une instruction System.out.println()
				}//fin for()
				break;
			}//fin du bloc d'instruction
			case 2:{//debut du bloc d'instruction-> selection 1
				System.out.println("choix 2");
				for(int i=0;i<=10;i++) {
					if(i%2 == 0) {//Bloc if pour vérifier si i  est un nombre pair, utilisation du modulo (reste == 0)
						System.out.println(" "+i);//indice i incrémenté dans une instruction System.out.println()
					}//fin if()
				}//fin for()
				break;
			}//fin du bloc d'instruction
			case 3:{//debut du bloc d'instruction-> selection 1
				System.out.println("choix 3");
				for(int i=0;i<=10;i++) {
					if(i%2 != 0) {//Bloc if pour vérifier si i  est un nombre impair, utilisation du modulo (reste différent de 0)
						System.out.println(" "+i);//indice i incrémenté dans une instruction System.out.println()
					}//fin if()
				}//fin for()
				break;
			}//fin du bloc d'instruction
			case 4:{//debut du bloc d'instruction-> selection 1
				System.out.println("choix 4");
				int i=1;//Variable pour la condition de sortie de boucle
				while(i<=10) {
					System.out.println("i: "+i);//Pour afficher l'indice i
					i++;//Pour incrementer la variable i-> sinon boucle continue
				}//fin while()
				break;
			}//fin du bloc d'instruction
			case 5:{//debut du bloc d'instruction-> selection 1
				System.out.println("choix 5");
				int i=0;//Variable pour la condition de sortie de boucle
				while(i<=10) {
					if(i%2 == 0) {//evaluation du nombre
						System.out.println("i: "+i);//Pour afficher l'indice i, si il est pais(reste==0)
					}//fin du bloc if()
					i++;//Pour incrementer la variable i-> sinon boucle continue
				}//fin while()
				break;
			}//fin du bloc d'instruction
			case 6:{//debut du bloc d'instruction-> selection 1
				System.out.println("choix 6");
				int i=0;//Variable pour la condition de sortie de boucle
				while(i<10) {//pour i indférieur à 10
					if(i%2 != 0) {//evaluation du nombre
						System.out.println("i: "+i);//Pour afficher l'indice i, si il est pais(reste==0)
					}//fin du bloc if()
					i++;//Pour incrementer la variable i-> sinon boucle continue
				}//fin while()
				break;
			}//fin du bloc d'instruction
			default:{//debut du bloc d'instruction-> selection non prse en charge
				System.out.println("Choix non pris en charge!!");
				break;
			}//fin du bloc d'instruction
		}//fin switch()
		scan.close();//fermeture du flux du scanner
	}//fin main()

}// Classe AffichageSuite()
