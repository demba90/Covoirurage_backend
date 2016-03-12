package sn.esp.covoituragebackend.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
/**
 * Entité Conducteur. Elle a une collection de voyage.
 * @author thiam
 *
 */
@Entity
@Table(name="conducteurs")
public class Conducteur {
	private Long idConducteur;
	private String loginConducteur;
	private String pwdConducteur;
	private String nomConducteur;
	private String prenomConducteur;
	private String telConducteur;
	private String adresseConducteur;
	private String emailConducteur;
	private int estFumeur;
	private Collection<Voyage> voyages;
	public Conducteur() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getIdConducteur() {
		return idConducteur;
	}
	public void setIdConducteur(Long idConducteur) {
		this.idConducteur = idConducteur;
	}
	@Length(min=8,max=45,message="Merci de vérifier les informations saisies dans ce champs")
	public String getLoginConducteur() {
		return loginConducteur;
	}
	
	public void setLoginConducteur(String loginConducteur) {
		this.loginConducteur = loginConducteur;
	}
	
	@Length(min=8,max=45,message="Merci de vérifier les informations saisies dans ce champs")
	public String getPwdConducteur() {
		return pwdConducteur;
	}
	public void setPwdConducteur(String pwdConducteur) {
		this.pwdConducteur = pwdConducteur;
	}
	@Length(min=2,max=45,message="Merci de vérifier les informations saisies dans ce champs")
	public String getNomConducteur() {
		return nomConducteur;
	}
	public void setNomConducteur(String nomConducteur) {
		this.nomConducteur = nomConducteur;
	}
	@Length(min=2,max=45,message="Merci de vérifier les informations saisies dans ce champs")
	public String getPrenomConducteur() {
		return prenomConducteur;
	}
	public void setPrenomConducteur(String prenomConducteur) {
		this.prenomConducteur = prenomConducteur;
	}
	@Length(min=9,max=15,message="Merci de vérifier les informations saisies dans ce champs")
	public String getTelConducteur() {
		return telConducteur;
	}
	public void setTelConducteur(String telConducteur) {
		this.telConducteur = telConducteur;
	}
	
	@Length(min=2,max=100,message="Merci de vérifier les informations saisies dans ce champs")
	public String getAdresseConducteur() {
		return adresseConducteur;
	}
	public void setAdresseConducteur(String adresseConducteur) {
		this.adresseConducteur = adresseConducteur;
	}
	@Email(message="Veuiller saisir un bon format d'email")
	public String getEmailConducteur() {
		return emailConducteur;
	}
	public void setEmailConducteur(String emailConducteur) {
		this.emailConducteur = emailConducteur;
	}
	public int getEstFumeur() {
		return estFumeur;
	}
	public void setEstFumeur(int estFumeur) {
		this.estFumeur = estFumeur;
	}
	
	@OneToMany(mappedBy="conducteur")
	public Collection<Voyage> getVoyages() {
		return voyages;
	}
	public void setVoyages(Collection<Voyage> voyages) {
		this.voyages = voyages;
	}
	
}
