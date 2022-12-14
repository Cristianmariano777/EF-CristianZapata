package com.idat.MicroservicioHospedaje.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.MicroservicioHospedaje.client.OpenFeignCliente;
import com.idat.MicroservicioHospedaje.dto.TuristaDTO;
import com.idat.MicroservicioHospedaje.model.Hospedaje;
import com.idat.MicroservicioHospedaje.model.HospedajeTuristaKF;
import com.idat.MicroservicioHospedaje.repository.DetalleHospedajeTuristaRepo;
import com.idat.MicroservicioHospedaje.repository.HospedajeRepository;

public class HospedajeServiceImp implements HospedajeService {

	@Autowired
	private HospedajeRepository hosperepo;
	
	@Autowired
	private DetalleHospedajeTuristaRepo detalle;
	
	@Autowired
	private OpenFeignCliente client;
	
	@Override
	public void guardar(Hospedaje hospedaje) {
		hosperepo.save(hospedaje);

	}

	@Override
	public void asignarHospedaje() {
		
		List<TuristaDTO> listado = client.listarTuristas();
		HospedajeTuristaKF fk = null;
				
		
		for (TuristaDTO turistaDTO : listado) {
			fk = new HospedajeTuristaKF();
			fk.setIdTurista(turistaDTO.getCodturi());
			fk.setIdHospedaje(1);
			
					
			
		}
			

	}

}
