package com.archi.si.erp;

import java.util.ArrayList;
import java.util.Iterator;

public class CatalogueOf extends ArrayList<Of>{

		private static CatalogueOf instance1 = null;
		public static CatalogueOf getInstance() {
			if (instance1 == null) {			// Singleton pour le catalogue Of 
				instance1 = new CatalogueOf();
			}
			return instance1;
		}
	//-----------------------------------AfficherOf()-------------------------------------\\
		public String afficherOf() {
			// TODO Auto-generated method stub
			
			Iterator<Of> it = iterator();
			String result = "";						// parcours la collection de commande client présente dans le catalogue et fait un afficherCmdeClients()
			while(it.hasNext()){					// pour chaque commande client de la collection et retourne l'intégralité des commandes parcouruent
				Of of = it.next();
				 result = result + of.afficherOf() + "\r\n";
			}
			return result;
			
		}
		
		public boolean validerRef(Of of){
			Iterator<Of> it = iterator();
			boolean isValid = true ;				// parcours la collection en vérifiant si le numero de commande client ,passé en paramètre, et égale
			while(it.hasNext()){					 // à un des numero de commande client de la collection. Si c'est le cas le boolean est faux, sinon il est vrai
				Of of1 = it.next();
				if(of.getReference() == of1.getReference()){
					isValid = false;
					break;
				
				
				}
			}
			return isValid;
		}
		
		
		
		
		}
