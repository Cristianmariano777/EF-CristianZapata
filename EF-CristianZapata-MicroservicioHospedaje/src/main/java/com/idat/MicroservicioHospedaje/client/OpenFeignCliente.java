package com.idat.MicroservicioHospedaje.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MicroservicioHospedaje.dto.TuristaDTO;

@FeignClient(name="turista-microservicio",url="localhost=8080")
public interface OpenFeignCliente {
	
	@GetMapping("/api/turista/v1/listar")
	public List<TuristaDTO> listarTuristas();

}
