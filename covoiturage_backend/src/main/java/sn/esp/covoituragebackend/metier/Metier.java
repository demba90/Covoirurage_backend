package sn.esp.covoituragebackend.metier;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sn.esp.covoituragebackend.config.LogConfig;
import sn.esp.covoituragebackend.entities.Conducteur;
import sn.esp.covoituragebackend.entities.Voiture;
import sn.esp.covoituragebackend.entities.Voyage;
import sn.esp.covoituragebackend.repositories.IConducteurRepository;
import sn.esp.covoituragebackend.repositories.IVoitureRepository;
import sn.esp.covoituragebackend.repositories.IVoyageRepository;

@Component
public class Metier implements IMetier{
	
	@Autowired
	private IVoyageRepository voyageRepository;
	@Autowired
	private IVoitureRepository voitureRepository;
	@Autowired
	private IConducteurRepository conducteurRepository;
	
	@Autowired
	private LogConfig logger = new LogConfig();
	
	private Logger log;
	
	public Metier() {
		super();
		log  = logger.getLog(getClass());
	}
	@Override
	public String testMetier() {
		return "Le metier répond bien";
	}
	@Override
	public Voiture addVoiture(Voiture v) {
		Voiture voiture = null;
		try {
			 voiture = voitureRepository.save(v);
			 log.info("Voiture de matricule "+v.getMatricule()+" ajoutée avec succès");
			 return v;
		} catch (Exception e) {
			log.error("Tentative d'ajout de la voitrue de matricule "+v.getMatricule()+" échouée"
					+ "erreur retournée :"+e.getMessage());
			 return null;
		}
		
	}
	@Override
	public Voiture findVoiture(Long refVoiture) {
		return voitureRepository.findOne(refVoiture);
	}
	@Override
	public Iterable<Voiture> findAllVoiture() {
		return  voitureRepository.findAll();
	}
	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
	}
	@Override
	public Voiture updateThisVoiture(Long refVoiture, Voiture v) {
		return null;
	}
	@Override
	public void deleteVoiture(Long refVoiture) {
		 voitureRepository.delete(refVoiture);
	}
	@Override
	public Voyage addVoyage(Voyage v) {
		return voyageRepository.save(v);
	}
	@Override
	public Voyage findVoyage(Long refVoyage) {
		return voyageRepository.findOne(refVoyage);
	}
	@Override
	public Iterable<Voyage> findAllVoyage() {
		return voyageRepository.findAll();
	}
	@Override
	public Voyage updateVoyage(Voyage v) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Voyage updateThisVoyage(Long refVoyage, Voyage v) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteVoyage(Long refVoyage) {
		voyageRepository.delete(refVoyage);
	}
	@Override
	public Conducteur addConducteur(Conducteur c) {
		return conducteurRepository.save(c);
	}
	@Override
	public Conducteur findConducteur(Long refConducteur) {
		// TODO Auto-generated method stub
		return conducteurRepository.findOne(refConducteur);
	}
	@Override
	public Iterable<Conducteur> findAllConducteur() {
		// TODO Auto-generated method stub
		return conducteurRepository.findAll();
	}
	@Override
	public Conducteur updateConducteur(Conducteur c) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Conducteur updateThisConducteur(Long refConducteur, Conducteur c) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteConducteur(Long refConducteur) {
		// TODO Auto-generated method stub
		conducteurRepository.delete(refConducteur);
	}
	@Override
	public Iterable<Voiture> findAllVoitureByEtat(String etat) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<Voiture> findAllVoitureByMarque(String marque) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<Voiture> findAllVoitureByModele(String modele) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
