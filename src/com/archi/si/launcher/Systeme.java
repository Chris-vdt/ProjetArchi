package com.archi.si.launcher;


import java.io.IOException;

import com.archi.si.data.SerializerCmdeClient;
import com.archi.si.data.SerializerOf;
import com.archi.si.erp.CatalogueCmdeClient;
import com.archi.si.erp.CatalogueOf;
import com.archi.si.erp.CmdeClient;
import com.archi.si.erp.Of;
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
	
	
	public static void main(String[] args) throws IOException{
		
		
		
		CatalogueCmdeClient catalogueCmdeClient = new CatalogueCmdeClient();
		CatalogueOf catalogueOf = new CatalogueOf();
		SerializerCmdeClient serCmd = new SerializerCmdeClient();
		SerializerOf serOf = new SerializerOf();
		catalogueCmdeClient = serCmd.loadClient();
		catalogueOf = serOf.loadOf();
		
		int choixMenu = -1;
		while (choixMenu != 99){
		dis.poserQuestion("Que voulez-vous faire ?");
		System.out.println(dis.afficherMenu());
		choixMenu = inp.readInt();
		
		switch (choixMenu){
		case 1://creation d'une commande
			dis.poserQuestion("Creattion de commande");
			int ref = poserQuestionInt("Reference :" );
			String date = poserQuestionString("Date :" );
			int quantite = poserQuestionInt("Quantite :");			
			
			CmdeClient p = new CmdeClient();
			p.creerCmdeClient(ref, date, quantite);
			
			boolean isRefValid = catalogueCmdeClient.validerRef(p);
			
			if(isRefValid == true){
				catalogueCmdeClient.add(p); 
				serCmd.saveClient(catalogueCmdeClient);
			}
			else{
				System.out.println("La reference n'est pas valide");
			}
			break;
		case 2: //Modifier Etat de la commande
			int indexCmde = poserQuestionInt("Quelle commande voulez-vous modifier ? (entrer la référence)");
			for (int i = 0; i < catalogueCmdeClient.size(); i++) {
				int j = i + 1;
				if (catalogueCmdeClient.get(i).getReference() == indexCmde){
					CmdeClient cmdeClient = catalogueCmdeClient.get(i);
					System.out.println(cmdeClient.afficherCmdeClient());
					
					String newEtat = poserQuestionString("Mise a jour de l'etat : ");
					cmdeClient.setEtat(newEtat);	
				}
			}
			break;
		case 3: //creer un OF
			dis.poserQuestion("Creation d'un Ordre de Fabrication");
			int refOf = poserQuestionInt("Reference :" );
			String etatOf = poserQuestionString("Etat: ");
			int quantiteOf = poserQuestionInt("Quantite :");
			String dateD = poserQuestionString("Date debut :");
			String dateF = poserQuestionString("Date fin :");
			Of of = new Of();
			of.creerOf(refOf, etatOf, quantiteOf, dateD, dateF);
			
			boolean isRefValid2 = catalogueOf.validerRef(of);
			
			if(isRefValid2 == true){
				catalogueOf.add(of); 
				serOf.saveOf(catalogueOf);
			}
			else{
				System.out.println("La reference n'est pas valide");
			}
			break;
		case 4://Imprimer l'OF
			int indexOf = poserQuestionInt("Quel OF voulez-vous imprimer ? (entrer la reference)");
			for (int i = 0; i < catalogueOf.size(); i++) {
				int j = i + 1;
				if (catalogueOf.get(i).getReference() == indexOf){
					Of of1 = catalogueOf.get(i);
					of1.imprimerOf(indexOf);
					System.out.println(of1.afficherOf());
				}
			}
			break;
		case 5:
		case 6:
		case 7:
		case 99:
			System.out.println("Fin de l'application\r\n");
			break;
		}
		
		
		}
	}

	

}
