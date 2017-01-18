package com.archi.si.erp;

import java.io.Serializable;

public class CmdeClient implements Serializable {

	private static final long serialVersionUID = 1L;
	private int reference;
	private String dateD;
	private int quantite;
	private String etat;
	
	
	//************************************ GETTER & SETTER *********************************************\\
	
	public int getReference() {
		return reference;
	}
	
	public void setReference(int reference) {
		this.reference = reference;
	}
	
	public String getDateD() {
		return dateD;
	}
	
	public void setDateD(String dateD) {
		this.dateD = dateD;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}

	//***********************************************Constructeur*************************************\\
	
	public void creerCmdeClient(int reference, String dateD, int quantite, String etat){
		this.reference = reference;
		this.dateD = dateD;
		this.quantite = quantite;
		this.etat = etat;
		}
	
	//*************************************************METHODES ****************************************\\
	
	
		public String afficherCmdeClient() {
<<<<<<< HEAD
			return " Numero commande client : " + this.reference +"," + " Datde de dï¿½but : " + this.dateD + "," + " Quantitï¿½ demandï¿½e : " + this.quantite + ","
=======
			return " Numero commande client : " + this.reference +"," + " Datde de début : " + this.dateD + "," + " Quantité demandée : " + this.quantite + ","
>>>>>>> 806d76b600062a532256e24830b20e6ab57998f6
					+  " Etat de la commande : " + this.etat;
		}
		// Retourne les attributs de la commande client
	
}
