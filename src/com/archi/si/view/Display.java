package com.archi.si.view;

public class Display {

	public String afficherMenu(){
		return "1 - Creer une commande"
				+ "\r\n2 - Modifier etat d'une commande"
				+ "\r\n3 - Creer un OF"
				+ "\r\n4 - Imprimer un OF"
				+ "\r\n - Afficher le stock PF"
				+ "\r\n - Ajouter un PF au stock PF"
				+ "\r\n - Supprimer un PF au stock PF"				
				+ "\r\n99 - Quitter";
				
	}
	
	public void poserQuestion(String question){   
		System.out.println(question); 
	}
	
	
}
