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
	public Voiture addVoiture(Voiture v);
	public Voiture findVoiture(Long refVoiture);
	public Iterable<Voiture> findAllVoiture();
	public Voiture updateVoiture(Voiture v);
	public Voiture updateThisVoiture(Long refVoiture,Voiture v);
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
