package sn.esp.covoituragebackend.metier;



import java.util.List;

import org.springframework.stereotype.Component;

import sn.esp.covoituragebackend.entities.Conducteur;
import sn.esp.covoituragebackend.entities.Voiture;
import sn.esp.covoituragebackend.entities.Voyage;

@Component
public interface IMetier {
	public String testMetier();
	/*crud sur les voitures*/
	/**
	 * Cette méthode permet d'ajouter une voiture. 
	 * @param Voiture v
	 * @return
	 */
	public Voiture addVoiture(Voiture v);
	
	/**
	 * Cette méthode permet de trouver une voiture connaissant son identifiant
	 * @param refVoiture
	 * @return
	 */
	public Voiture findVoiture(Long refVoiture);
	
	/**
	 * Cette méthode permet de lister toutes les voitures dans la plateforme
	 * @return
	 */
	public Iterable<Voiture> findAllVoiture();
	
	/**
	 * Cette méthode permet de lister toutes les voitures dans la plateforme
	 * selon un état
	 * @param etat
	 * @return
	 */
	public Iterable<Voiture> findAllVoitureByEtat(String etat);
	
	/**
	 * Cette méthode permet de lister toutes les voitures dans la plateforme
	 * ayant une marque donnée
	 * @param marque
	 * @return
	 */
	public Iterable<Voiture> findAllVoitureByMarque(String marque);
	
	/**
	 * Cette méthode permet de lister toutes les voitures de la plateforme qui sont d'un modele
	 * modele
	 * @param modele
	 * @return
	 */
	public Iterable<Voiture> findAllVoitureByModele(String modele);
	/**
	 * Cette méthode permet de modifier les informations sur une voiture
	 * @param v
	 * @return
	 */
	public Voiture updateVoiture(Voiture v);
	/**
	 * Meme que la méthode en haut mais celle-ci est ajouter pour plus de flexibilité
	 * @param refVoiture
	 * @param v
	 * @return
	 */
	public Voiture updateThisVoiture(Long refVoiture,Voiture v);
	/**
	 * Cette méthode permet de supprimer une voiture de la plateforme. 
	 * Pour le cas de la suppression, on verra si on ne peut pas juste chnagé le statut de la voiture
	 * de 1 à 0 .
	 * @param refVoiture
	 */
	public void deleteVoiture(Long refVoiture);
	/*crud sur les voyages*/
	public Voyage addVoyage(Voyage v);
	public Voyage findVoyage(Long refVoyage);
	public Iterable<Voyage> findAllVoyage();
	public Voyage updateVoyage(Voyage v);
	public Voyage updateThisVoyage(Long refVoyage,Voyage v);
	public void deleteVoyage(Long refVoyage);
	/*crud sur les conducteurs*/
	public Conducteur addConducteur(Conducteur c);
	public Conducteur findConducteur(Long refConducteur);
	public Iterable<Conducteur> findAllConducteur();
	public Conducteur updateConducteur(Conducteur c);
	public Conducteur updateThisConducteur(Long refConducteur,Conducteur c);
	public void deleteConducteur(Long refConducteur);
}
