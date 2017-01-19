package com.archi.si.erp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Of {
	private int reference;
	private String etat;
	private int quantite;
	private String dateD;
	private String dateF;
	//private ProduitF pF;
	
	
	

//-------------------------------GETTERS & SETTERS------------------------------------------//
	public int getReference() {
		return reference;
	}

	
	public void setReference(int reference) {
		this.reference = reference;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

public String getDateD() {
		return dateD;
	}


	public void setDateD(String dateD) {
		this.dateD = dateD;
	}


	public String getDateF() {
		return dateF;
	}


	public void setDateF(String dateF) {
		this.dateF = dateF;
	}


	//------------------------------------METHODS----------------------------------------------//
	public void creerOf(int reference, int quantite){
		this.reference = reference;
		this.quantite = quantite;
	}
	
	public void confirmerOf(int ref){
		if (this.reference == ref){
			this.setEtat("etat : OF Confirmé !");
			System.out.println(this.getEtat());
		}
	}
		
	public void plannifierOf(int ref){
		if (this.reference == ref){
			this.setEtat("Plannifié");
			System.out.println(this.getEtat());
		}
	}
	
	public void imprimerOf(int ref){
		if (this.reference == ref){
			this.setEtat("Imprimé");
			System.out.println(this.getEtat());
		}
	}
	
	public void envoiProdOf(int ref){
		if (this.reference == ref){
			this.setEtat("Envoyé en production");
			System.out.println(this.getEtat());
		}
	}
	
	public void realiserOf(int ref){
		if (this.reference == ref){
			this.setEtat("En cours de production");
			System.out.println(this.getEtat());
		}
	}


	public String afficherOf() {
		// TODO Auto-generated method stub
		return "reference de l'OF : " + this.reference + ", etat : " + this.etat + ", quantité : "
				+ this.quantite + ", date de début : " + this.dateD + ", date de fin : " + this.dateF;
		//A RAJOUTER ---> ", produit : " + this.ProduitF;
	}
	
	
}
