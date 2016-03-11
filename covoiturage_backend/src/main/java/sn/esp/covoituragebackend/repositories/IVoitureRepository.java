package sn.esp.covoituragebackend.repositories;

import org.springframework.data.repository.CrudRepository;

import sn.esp.covoituragebackend.entities.Voiture;

public interface IVoitureRepository extends CrudRepository<Voiture, Long>{

}
