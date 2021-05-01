package com.everis.evaluacion1.Raul.Farias.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.evaluacion1.Raul.Farias.models.Venta;
import com.everis.evaluacion1.Raul.Farias.repositories.VentaRepository;

@Service
public class VentaService {
	
	@Autowired
	VentaRepository ventaRepository;

	public Venta insertVenta(Venta venta) {
		return ventaRepository.save(venta);
	}

	public Optional<Venta> selectVenta(long id) {
		return ventaRepository.findById(id);
	}

	public String eliminarVenta(long id) {
		ventaRepository.deleteById(id);
		return "Venta eliminada";
	}

	public Venta actualizarUnidades(String unidades, long id) {
		Venta venta = ventaRepository.findById(id).get();
		venta.setUnidades(Integer.parseInt(unidades));
		return ventaRepository.save(venta);
	}

	public ArrayList<Venta> allUsers() {
		return (ArrayList<Venta>) ventaRepository.findAll();
	}

}
