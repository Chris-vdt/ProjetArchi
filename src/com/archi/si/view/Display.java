package com.archi.si.view;

public class Display {

	public String afficherMenu(){
		return "1 - Creer une commande"
				+ "\r\n2 - Modifier etat d'une commande"
				+ "\r\n3 - Creer un OF"
				+ "\r\n4 - Imprimer un OF"
				+ "\r\n5 - Afficher les commandes clients"
				+"\r\n6 - Afficher les OFs"	
				+ "\r\n99 - Quitter";
				
	}
	
	public void poserQuestion(String question){   
		System.out.println(question); 
	}
	
	
}
