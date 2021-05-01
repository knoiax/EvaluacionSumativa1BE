package com.everis.evaluacion1.Raul.Farias.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.evaluacion1.Raul.Farias.models.Usuario;
import com.everis.evaluacion1.Raul.Farias.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario insertUser(Usuario usuario) {		
		return usuarioRepository.save(usuario);
	}

	public Optional<Usuario> selectUser(long id) {
		return usuarioRepository.findById(id);
	}

	public Object buscaTodos() {
		return usuarioRepository.findAll();
	}

	//se cambia tipo de dato String por Usuario para mostrar el cambio
	public Usuario eliminarUsuario(long id) {
		//codigo para data warehouse manteniendo el registro con id incluido
		Usuario usuario = usuarioRepository.findById(id).get();
		usuario.setNombre(null);
		usuario.setDireccion(null);
		usuario.setRut(null);		
		return usuarioRepository.save(usuario);		
		/*si bien el codigo a continuacion es el metodo correcto para eliminar la data, createdAt y updatedAt 
		 * pierden sentido al eliminar todo el contenido, si solo dejamos los campos null se actualiza la variable 
		 * updatedAt y es mas util para data-analitycs, big-data, data-Warehouse en general.
		 * 
		 * usuarioRepository.deleteById(id);
		return "Usuario eliminado";*/
	}

	public Usuario actualizarNombre(String nombre, long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuario.setNombre(nombre);
		return usuarioRepository.save(usuario) ;
	}

	public Usuario actualizarDireccion(String direccion, long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuario.setDireccion(direccion);
		return usuarioRepository.save(usuario);
	}

	public long contadorMax() {		
		return usuarioRepository.count();
	}
}
