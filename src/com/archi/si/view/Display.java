package com.archi.si.view;

public class Display {

	public String afficherMenu(){
		return "1 - Créer une commande"
				+ "\r\n - Modifier état de la commande"
				+ "\r\n - Créer un OF"
				+ "\r\n - Modifier un OF"
				+ "\r\n - Imprimer un OF"
				+ "\r\n - Afficher le stock PF"
				+ "\r\n - Ajouter un PF au stock PF"
				+ "\r\n - Supprimer un PF au stock PF"
				+ "\r\n - Afficher le stock MP"
				+ "\r\n - Ajouter le MP au stock MP"
				+ "\r\n - Supprimer un MP au stock MP"
				+ "\r\n99 - Quitter";
				
	}
	
	public void poserQuestion(String question){   
		System.out.println(question); 
	}
	
	
}
