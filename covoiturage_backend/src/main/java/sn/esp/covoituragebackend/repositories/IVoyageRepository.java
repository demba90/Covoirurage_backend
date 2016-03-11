package sn.esp.covoituragebackend.repositories;

import org.springframework.data.repository.CrudRepository;

import sn.esp.covoituragebackend.entities.Voyage;

public interface IVoyageRepository extends CrudRepository<Voyage, Long>{

}
