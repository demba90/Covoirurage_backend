package sn.esp.covoituragefrontend.api;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.covoituragebackend.config.LogConfig;
import sn.esp.covoituragebackend.entities.Conducteur;
import sn.esp.covoituragebackend.entities.Voiture;
import sn.esp.covoituragebackend.entities.Voyage;
import sn.esp.covoituragebackend.metier.IMetier;


@RestController
@RequestMapping(value="yobalema")
public class ApiController {
	@Autowired
	private IMetier metier;
	@Autowired
	private LogConfig logger = new LogConfig();
	private Logger log;
	
	public ApiController() {
		super();
		log = logger.getLog(ApiController.class);
		log.info("Démarrage de la plateforme");
	}

	@RequestMapping(method=RequestMethod.GET,value="/test")
	public String test(){
		log.info("test du métie");
		return metier.testMetier();
	}
	
	/**
	 * Les méthodes d'ajouts utilisant la méthode GET sont utilisées
	 *  juste pour facilité le test mais les méthodes qui doivent etre utilisées 
	 *  pour ajouter une ressource se sont POST et PUT.
	 *  Get est utilisée pour récuperer une ressource
	 */

	/*Début :    --- CRUDL sur l'entité Conducteur ---*/
	@RequestMapping(method=RequestMethod.GET,value="/ajouterConducteur")
	public Conducteur addConducteurGet(Conducteur c){
		return metier.addConducteur(c);
	}
	
	@RequestMapping(method={RequestMethod.POST,RequestMethod.PUT},value="/ajouterConducteur")
	public Conducteur addConducteur(Conducteur c){
		return metier.addConducteur(c);
	}
	
	/*Fin :    --- CRUDL sur l'entité Conducteur ---*/

	
	/*Début :    --- CRUDL sur l'entité Voiture ---*/
	
	@RequestMapping(method=RequestMethod.GET,value="/ajouterVoiture")
	public Voiture addVoitureGet(Voiture v){
		return metier.addVoiture(v);
	}
	
	@RequestMapping(method={RequestMethod.POST,RequestMethod.PUT},value="/ajouterVoiture")
	public Voiture addVoiture(Voiture v){
		return metier.addVoiture(v);
	}
	
	/*Fin :    --- CRUDL sur l'entité Voiture ---*/

	
	
	/*Début :    --- CRUDL sur l'entité Voyage ---*/
	@RequestMapping(method=RequestMethod.GET,value="/ajouterVoyage")
	public Voyage addVoyageGet(Voyage v){
		return metier.addVoyage(v);
	}
	@RequestMapping(method={RequestMethod.POST,RequestMethod.PUT},value="/ajouterVoyage")
	public Voyage addVoyage(Voyage v){
		return metier.addVoyage(v);
	}
	
	/*Fin :    --- CRUDL sur l'entité Voyage ---*/
	
	/************ Autres traitement ***********************/

}
