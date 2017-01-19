package com.archi.si.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.archi.si.erp.CatalogueCmdeClient;
import com.archi.si.erp.CatalogueOf;

public class SerializerOf {
	
	public CatalogueOf loadOf(){
		//******************************** DESERIALISATION = récupère le fichier sauvegardé ******************************************/
			// On créer une liste "catalogueP" qui est une nouvelle ArrayList
			CatalogueOf catalogueOf = new CatalogueOf();
				try {
					FileInputStream streamIn1 = new FileInputStream("C:/Users/ASUS/Documents/EnregistrementSerializer/monCatalogueOf.ser");   //On charge le fichier qui se trouve à l'espace indiqué
					ObjectInputStream objectinputstream1 = new ObjectInputStream(streamIn1);
					try {
						catalogueOf = (CatalogueOf) objectinputstream1.readObject();
					} finally {
						try {
							objectinputstream1.close();
						} finally {
							streamIn1.close();
						}
					}
				} catch (IOException ioe) {
					// ioe.printStackTrace();
					System.out.println("nouveau catalogue Of");    // si le catalogue n'existe pas, la création d'un nouveau catalogue est indiquée
				} catch (ClassNotFoundException cnfe) {
					cnfe.printStackTrace();
				}
				return catalogueOf;				// retourne le catalogue chargé

			}
	
	public void saveOf(CatalogueOf cat) throws IOException{
		
		FileOutputStream fout = new FileOutputStream("C:/Users/ASUS/Documents/EnregistrementSerializer/monCatalogueOf.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(cat);								// sauvegarde du catalogue dans le fichier
		oos.close();
	}
}
