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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ventas")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codigoProducto;
	private Long idUsuario;
	@Min(1)
	private int unidades;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
		
	//C		
	public Venta() {
		super();
	}
	public Venta(@NotEmpty(message = "codigoProducto es un campo obligatorio") Long codigoProducto,
			@NotEmpty(message = "idUsuario es un campo obligatorio") Long idUsuario,
			@NotEmpty(message = "unidades es un campo obligatorio") @Min(1) int unidades) {
		super();
		this.codigoProducto = codigoProducto;
		this.idUsuario = idUsuario;
		this.unidades = unidades;
	}

	//G & S
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}	
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}	
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
}
