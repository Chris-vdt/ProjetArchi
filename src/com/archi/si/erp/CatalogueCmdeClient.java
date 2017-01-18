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
<<<<<<< HEAD
		String result = "";						// parcours la collection de commande client prï¿½sente dans le catalogue et fait un afficherCmdeClients()
		while(it.hasNext()){					// pour chaque commande client de la collection et retourne l'intï¿½gralitï¿½ des commandes parcouruent
=======
		String result = "";						// parcours la collection de commande client présente dans le catalogue et fait un afficherCmdeClients()
		while(it.hasNext()){					// pour chaque commande client de la collection et retourne l'intégralité des commandes parcouruent
>>>>>>> 806d76b600062a532256e24830b20e6ab57998f6
			CmdeClient client = it.next();
			 result = result + client.afficherCmdeClient() + "\r\n";
		}
		return result;
		
	}
	
	public boolean validerRef(CmdeClient cmdeClient){
		Iterator<CmdeClient> it = iterator();
<<<<<<< HEAD
		boolean isValid = true ;				// parcours la collection en vï¿½rifiant si le numero de commande client ,passï¿½ en paramï¿½tre, et ï¿½gale
		while(it.hasNext()){					 // ï¿½ un des numero de commande client de la collection. Si c'est le cas le boolean est faux, sinon il est vrai
=======
		boolean isValid = true ;				// parcours la collection en vérifiant si le numero de commande client ,passé en paramètre, et égale
		while(it.hasNext()){					 // à un des numero de commande client de la collection. Si c'est le cas le boolean est faux, sinon il est vrai
>>>>>>> 806d76b600062a532256e24830b20e6ab57998f6
			CmdeClient c1 = it.next();
			if(cmdeClient.getReference() == c1.getReference()){
				isValid = false;
				break;
			
			
			}
		}
		return isValid;
	}
	
	
	
	
	}
	