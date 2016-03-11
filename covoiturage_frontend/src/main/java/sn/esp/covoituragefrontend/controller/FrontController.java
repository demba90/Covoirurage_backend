package sn.esp.covoituragefrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.esp.covoituragebackend.entities.Conducteur;
import sn.esp.covoituragebackend.metier.IMetier;


@RestController
@RequestMapping(value="yobalema")
public class FrontController {
	@Autowired
	private IMetier metier;
	
	@RequestMapping(method=RequestMethod.GET,value="/test")
	public String test(){
		return metier.testMetier();
	}
	
	@RequestMapping(method={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT},value="/ajouterConducteur")
	public Conducteur addConducteur(Conducteur c){
		return metier.addConducteur(c);
	}
}
