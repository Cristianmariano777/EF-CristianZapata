package com.idat.MicroservicioTurista.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "turista")
public class TuristaModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idturista;
    private String nombreturista;
    private String nroCelular;
    private String direccion;
    
	public Integer getIdturista() {
		return idturista;
	}
	public void setIdturista(Integer idturista) {
		this.idturista = idturista;
	}
	public String getNombreturista() {
		return nombreturista;
	}
	public void setNombreturista(String nombreturista) {
		this.nombreturista = nombreturista;
	}
	public String getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
    

}
