package com.everis.evaluacion1.Raul.Farias.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.evaluacion1.Raul.Farias.models.Producto;
import com.everis.evaluacion1.Raul.Farias.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;

	public Producto insertProduct(Producto producto) {
		return productoRepository.save(producto);		
	}

	public Optional<Producto> selectProduct(long id) {
		return productoRepository.findById(id);
	}
	/*al igual que en Usuarios se deja comentado el texto para darle valor y utilidad a 
	 * createdAt y updatedAt para Data Warehouse
	 * de igual forma se cambia tipo de dato de String a Producto*/
	public Producto eliminarProduct(long id) {
		Producto producto = productoRepository.findById(id).get();
		producto.setNombre(null);
		producto.setDescripcion(null);
		producto.setPrecio(0);
		return productoRepository.save(producto);
		
		/*productoRepository.deleteById(id);
		return "Producto eliminado";*/
	}

	public Producto actualizarNombreP(String nombre, long id) {
		Producto producto = productoRepository.findById(id).get();
		producto.setNombre(nombre);
		return productoRepository.save(producto);
	}

	public Producto actualizarPrecio(String precio, long id) {
		Producto producto = productoRepository.findById(id).get();
		producto.setPrecio(Integer.parseInt(precio));
		return productoRepository.save(producto);
	}

	public Producto actualizarDescripcion(String descripcion, long id) {
		Producto producto = productoRepository.findById(id).get();
		producto.setDescripcion(descripcion);
		return productoRepository.save(producto);
	}

	public long contadorMax() {
		return productoRepository.count();
	}

	public ArrayList<Producto> allUsers() {
		return (ArrayList<Producto>) productoRepository.findAll();
	}

}
