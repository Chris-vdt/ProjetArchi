package com.archi.si.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.archi.si.erp.CatalogueOf;

public class SerializerOf {
	
<<<<<<< HEAD
	public CatalogueOf loadOf(){
		//******************************** DESERIALISATION = r�cup�re le fichier sauvegard� ******************************************/
			// On cr�er une liste "catalogueP" qui est une nouvelle ArrayList
		CatalogueOf catalogueCmde = new CatalogueOf();
				try {
					FileInputStream streamIn2 = new FileInputStream("C:/Users/Simon/workspace/monCatalogueCmdeClient.ser");   //On charge le fichier qui se trouve � l'espace indiqu�
=======
	public CatalogueOf loadClient(){
		//******************************** DESERIALISATION = r�cup�re le fichier sauvegard� ******************************************/
			// On cr�er une liste "catalogueP" qui est une nouvelle ArrayList
		CatalogueOf catalogueCmde = new CatalogueOf();
				try {
					FileInputStream streamIn2 = new FileInputStream("C:/Users/Simon/workspace/monCatalogueCmdeClient.ser");   //On charge le fichier qui se trouve � l'espace indiqu�
>>>>>>> 806d76b600062a532256e24830b20e6ab57998f6
					ObjectInputStream objectinputstream2 = new ObjectInputStream(streamIn2);
					try {
						catalogueCmde = (CatalogueOf) objectinputstream2.readObject();
					} finally {
						try {
							objectinputstream2.close();
						} finally {
							streamIn2.close();
						}
					}
				} catch (IOException ioe) {
					// ioe.printStackTrace();
<<<<<<< HEAD
					System.out.println("nouveau calogue");    // si le catalogue n'existe pas, la cr�ation d'un nouveau catalogue est indiqu�e
				} catch (ClassNotFoundException cnfe) {
					cnfe.printStackTrace();
				}
				return catalogueCmde;				// retourne le catalogue charg�

			}
	
	public void saveOf(CatalogueOf catClient) throws IOException{
=======
					System.out.println("nouveau calogue");    // si le catalogue n'existe pas, la cr�ation d'un nouveau catalogue est indiqu�e
				} catch (ClassNotFoundException cnfe) {
					cnfe.printStackTrace();
				}
				return catalogueCmde;				// retourne le catalogue charg�

			}
	
	public void saveClient(CatalogueOf catClient) throws IOException{
>>>>>>> 806d76b600062a532256e24830b20e6ab57998f6
		
		FileOutputStream fout2 = new FileOutputStream("C:/Users/Simon/workspace/monCatalogueClient.ser");
		ObjectOutputStream oos2 = new ObjectOutputStream(fout2);
		oos2.writeObject(catClient);								// sauvegarde du catalogue dans le fichier
		oos2.close();
	}
}
