package com.archi.si.erp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Of {
	private int reference;
	private String etat;
	private int quantite;
	private String dateD;
	private String dateF;	
	
	/*public Of(int reference, String etat, int quantite) {
		super();
		this.reference = reference;
		this.etat = etat;
		this.quantite = quantite;
	}
	*/
	
	

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
	public void creerOf(int reference, String etat, int quantite, String dateD, String dateF){
		this.reference = reference;
		this.etat = etat;
		this.quantite = quantite;
		this.dateD = dateD;
		this.dateF = dateF;
	}
	
	public void confirmerOf(int ref){
		if (this.reference == ref){
			this.setEtat("etat : OF Confirm� !");
			System.out.println(this.getEtat());
		}
	}
		
	public void plannifierOf(int ref){
		if (this.reference == ref){
			this.setEtat("etat : OF Plannifi� !");
			System.out.println(this.getEtat());
		}
	}
	
	public void imprimerOf(int ref){
		if (this.reference == ref){
			this.setEtat("etat : OF Imprim� !");
			System.out.println(this.getEtat());
		}
	}
	
	public void envoiProdOf(int ref){
		if (this.reference == ref){
			this.setEtat("etat : OF est envoy� en production");
			System.out.println(this.getEtat());
		}
	}
	
	public void realiserOf(int ref){
		if (this.reference == ref){
			this.setEtat("etat : OF est r�alis�");
			System.out.println(this.getEtat());
		}
	}
	
	
}
