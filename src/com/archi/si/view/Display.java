package com.archi.si.view;

public class Display {

	public String afficherMenu(){
		return "1 - Créer une commande"
				+ "\r\n2 - Modifier état d'une commande"
				+ "\r\n3 - Créer un OF"
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
