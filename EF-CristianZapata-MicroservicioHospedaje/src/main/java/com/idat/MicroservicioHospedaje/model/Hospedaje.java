package com.idat.MicroservicioHospedaje.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="hospedaje")
@Entity
public class Hospedaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idhospedaje;
	private String nombre;
	
	public Integer getIdhospedaje() {
		return idhospedaje;
	}
	public void setIdhospedaje(Integer idhospedaje) {
		this.idhospedaje = idhospedaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
