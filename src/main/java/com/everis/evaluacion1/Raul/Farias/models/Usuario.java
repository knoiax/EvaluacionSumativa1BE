package com.everis.evaluacion1.Raul.Farias.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=4,max=50)
	private String nombre;
	@Size(min=10,max=100)
	private String direccion;
	private String rut;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//C
	public Usuario() {
		super();
	}	
	public Usuario(@Size(min = 4, max = 50) String nombre, @Size(min = 10, max = 100) String direccion, String rut) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.rut = rut;
	}

	//G & S	
	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}	
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	
}
