package com.idat.MicroservicioTurista.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioTurista.dto.TuristaDTO;
import com.idat.MicroservicioTurista.model.TuristaModel;
import com.idat.MicroservicioTurista.repository.TuristaRepository;

@Service
public class TuristaServiceImp implements TuristaService {

	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		// TODO Auto-generated method stub
		
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
		
		for (TuristaModel turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setCodturi(turista.getIdturista());
			dto.setNomturi(turista.getNombreturista());
			dto.setCelturi(turista.getNroCelular());
			dto.setDirturi(turista.getDireccion());
			listadto.add(dto);
		}
				
        	return listadto;
	}

	@Override
	public TuristaDTO obtenerId(Integer id) {
		
       TuristaModel turista = repository.findById(id).orElse(null);
       
       TuristaDTO dto = new TuristaDTO();
       dto.setCodturi(turista.getIdturista());
		dto.setNomturi(turista.getNombreturista());
		dto.setCelturi(turista.getNroCelular());
		dto.setDirturi(turista.getNroCelular());
		
		return dto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		
		TuristaModel turi = new TuristaModel();
		turi.setIdturista(turista.getCodturi());
		turi.setNombreturista(turista.getNomturi());
		turi.setNroCelular(turista.getCelturi());
		turi.setDireccion(turista.getDirturi());
		
		
		repository.save(turi);

	}

	@Override
	public void actualizar(TuristaDTO turista) {
		TuristaModel turi = new TuristaModel();
		turi.setIdturista(turista.getCodturi());
		turi.setNombreturista(turista.getNomturi());
		turi.setNroCelular(turista.getCelturi());
		turi.setDireccion(turista.getDirturi());
		
		repository.saveAndFlush(turi);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

}
