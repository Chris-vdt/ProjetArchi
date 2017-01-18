package com.archi.si.launcher;


import com.archi.si.view.Display;
import com.archi.si.view.Input;

public class Systeme {

	static Display dis = new Display();
	static Input inp = new Input();
	
	
	public static int poserQuestionInt (String q){
		dis.poserQuestion(q);
		int retour = inp.readInt();
		return retour;
	}
	
	public static String poserQuestionString (String q){
		dis.poserQuestion(q);
		String retour = inp.readString();
		return retour;
	}
	
	
	
	public static void main(String[] args){
		int choixMenu = -1;
		while (choixMenu != 99){
		dis.poserQuestion("Que voulez-vous faire ?");
		System.out.println(dis.afficherMenu());
		choixMenu = inp.readInt();
		
		switch (choixMenu){
		case 1://creation d'une commande
			int nvlleRef = poserQuestionInt("Référence :" );
			String quantité = poserQuestionString ("Quantité :");
			String etat = poserQuestionString("Etat (En cours de traitement/Livré): ");
			double nvPrix = poserQuestionDouble("Quel est le nouveau prix du produit?");
			
			
			Commande p = new Commande(nvlleRef, quantité, etat);
			boolean isPrixValid = p.validerPrix();
			boolean isRefValid = catalogueProduit.validerRef(p);
			
			if(isPrixValid == true && isRefValid == true){
				catalogueProduit.add(p);                    // si le prix et la r�f�rence du nouveau produit sont valide alors le produit est ajout� au catalogue
				serp.saveProduit(catalogueProduit);
			}
			else{
				System.out.println("Le produit n'est pas valide (prix et/ou r�f�rence !");
			}
			
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 99:
			System.out.println("Fin de l'application\r\n");
			break;
		}
		
		
		}
	}

}
