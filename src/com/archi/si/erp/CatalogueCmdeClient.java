package com.archi.si.erp;

import java.util.ArrayList;
import java.util.Iterator;

public class CatalogueCmdeClient extends ArrayList<CmdeClient>{

	private static CatalogueCmdeClient instance2 = null;
	public static CatalogueCmdeClient getInstance() {
		if (instance2 == null) {						// Singleton pour le catalogue Commande Client 
			instance2 = new CatalogueCmdeClient();
		}
		return instance2;
	}
//-----------------------------------AfficherProduits()-------------------------------------\\
	public String afficherCmdeClients() {
		// TODO Auto-generated method stub
		
		Iterator<CmdeClient> it = iterator();
		String result = "";						// parcours la collection de commande client présente dans le catalogue et fait un afficherCmdeClients()
		while(it.hasNext()){					// pour chaque commande client de la collection et retourne l'intégralité des commandes parcouruent
			CmdeClient client = it.next();
			 result = result + client.afficherClient() + "\r\n";
		}
		return result;
		
	}
	
	public boolean validerRef(CmdeClient cmdeClient){
		Iterator<CmdeClient> it = iterator();
		boolean isValid = true ;				// parcours la collection en vérifiant si le numero de commande client ,passé en paramètre, et égale
		while(it.hasNext()){					 // à un des numero de commande client de la collection. Si c'est le cas le boolean est faux, sinon il est vrai
			CmdeClient c1 = it.next();
			if(cmdeClient.getReference() == c1.getReference()){
				isValid = false;
				break;
			
			
			}
		}
		return isValid;
	}
	
	
	
	
	}
	