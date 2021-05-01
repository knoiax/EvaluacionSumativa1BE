package com.everis.evaluacion1.Raul.Farias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.evaluacion1.Raul.Farias.models.Venta;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Long>{

}
