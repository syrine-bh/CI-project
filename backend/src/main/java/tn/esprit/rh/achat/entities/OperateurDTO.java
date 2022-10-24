package tn.esprit.rh.achat.entities;

import java.util.Set;

public class OperateurDTO {
	private Long idOperateur;
	private String nom;
	private String prenom;
	private String password;
	private Set<Facture> factures;
	public Long getIdOperateur() {
		return idOperateur;
	}
	public void setIdOperateur(Long idOperateur) {
		this.idOperateur = idOperateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Facture> getFactures() {
		return factures;
	}
	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}
	public OperateurDTO(Long idOperateur, String nom, String prenom, String password, Set<Facture> factures) {
		this.idOperateur = idOperateur;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.factures = factures;
	}
	
	
	
}
