package com.everis.evaluacion1.Raul.Farias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.evaluacion1.Raul.Farias.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
