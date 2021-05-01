package com.everis.evaluacion1.Raul.Farias.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.evaluacion1.Raul.Farias.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {


}
