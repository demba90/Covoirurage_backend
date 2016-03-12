package sn.esp.covoituragebackend.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;
/**
 * Entité Voyage. Elle est en relation avec  Conducteur et Voiture
 * @author thiam
 *
 */
@Entity
@Table(name="voyages")
public class Voyage {
	private Long idVoyage;
	private String villeDepart;
	private String villeArrivee;
	private Date dateVoyage;
	private Float prixVoyage;
	private int etatVoyage;
	private Conducteur conducteur;
	private Voiture voiture;
	public Voyage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdVoyage() {
		return idVoyage;
	}
	public void setIdVoyage(Long idVoyage) {
		this.idVoyage = idVoyage;
	}
	@Length(max=100,min=2,message="Merci de vérifier les informations saisies")
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	
	@Length(max=100,min=2,message="Merci de vérifier les informations saisies")
	public String getVilleArrivee() {
		return villeArrivee;
	}
	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}
	
	public Date getDateVoyage() {
		return dateVoyage;
	}
	public void setDateVoyage(Date dateVoyage) {
		this.dateVoyage = dateVoyage;
	}
	public Float getPrixVoyage() {
		return prixVoyage;
	}
	public void setPrixVoyage(Float prixVoyage) {
		this.prixVoyage = prixVoyage;
	}
	public int getEtatVoyage() {
		return etatVoyage;
	}
	public void setEtatVoyage(int etatVoyage) {
		this.etatVoyage = etatVoyage;
	}
	@ManyToOne
	@JoinColumn(name="REF_CONDUCTEUR")
	public Conducteur getConducteur() {
		return conducteur;
	}

	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}
	@ManyToOne
	@JoinColumn(name="REF_VOITURE")
	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
}
