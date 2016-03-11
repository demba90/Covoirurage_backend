package sn.esp.covoituragebackend.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="voitures")
public class Voiture {
	private Long idVoyage;
	private String marque;
	private String modele;
	private int ndPlaces;
	private String matricule;
	private String etat;
	
	private Collection<Voyage> voyages;
	
	public Voiture() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdVoyage() {
		return idVoyage;
	}
	public void setIdVoyage(Long idVoyage) {
		this.idVoyage = idVoyage;
	}
	
	@Length(min=2,max=45,message="Merci de vérifier les informations saisies dans ce champs")
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	@Length(min=2,max=45,message="Merci de vérifier les informations saisies dans ce champs")
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	@Length(min=1,message="Merci de vérifier les informations saisies dans ce champs")
	public int getNdPlaces() {
		return ndPlaces;
	}
	public void setNdPlaces(int ndPlaces) {
		this.ndPlaces = ndPlaces;
	}
	@Length(min=10,max=10,message="Merci de vérifier les informations saisies dans ce champs")
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	@Length(min=3,message="Merci de vérifier les informations saisies dans ce champs")
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	@OneToMany(mappedBy="voiture")
	public Collection<Voyage> getVoyages() {
		return voyages;
	}
	
	public void setVoyages(Collection<Voyage> voyages) {
		this.voyages = voyages;
	}
	
	
		
}
