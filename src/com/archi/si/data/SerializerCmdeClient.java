package com.archi.si.data;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.archi.si.erp.CatalogueCmdeClient;;

public class SerializerCmdeClient {
	
		public CatalogueCmdeClient loadClient(){
			//******************************** DESERIALISATION = récupère le fichier sauvegardé ******************************************/
				// On créer une liste "catalogueP" qui est une nouvelle ArrayList
				CatalogueCmdeClient catalogueCmde = new CatalogueCmdeClient();
					try {
						FileInputStream streamIn2 = new FileInputStream("C:/Users/ASUS/Documents/EnregistrementSerializer/monCatalogueCmdeClient.ser");   //On charge le fichier qui se trouve à l'espace indiqué
						ObjectInputStream objectinputstream2 = new ObjectInputStream(streamIn2);
						try {
							catalogueCmde = (CatalogueCmdeClient) objectinputstream2.readObject();
						} finally {
							try {
								objectinputstream2.close();
							} finally {
								streamIn2.close();
							}
						}
					} catch (IOException ioe) {
						// ioe.printStackTrace();
						System.out.println("nouveau catalogue Cmde Client");    // si le catalogue n'existe pas, la création d'un nouveau catalogue est indiquée
					} catch (ClassNotFoundException cnfe) {
						cnfe.printStackTrace();
					}
					return catalogueCmde;				// retourne le catalogue chargé

				}
		
		public void saveClient(CatalogueCmdeClient catClient) throws IOException{
			
			FileOutputStream fout2 = new FileOutputStream("C:/Users/ASUS/Documents/EnregistrementSerializer/monCatalogueCmdeClient.ser");
			ObjectOutputStream oos2 = new ObjectOutputStream(fout2);
			oos2.writeObject(catClient);								// sauvegarde du catalogue dans le fichier
			oos2.close();
		}
	}



