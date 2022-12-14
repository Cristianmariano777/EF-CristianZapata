package com.idat.MicroservicioHospedaje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioHospedaje.model.Hospedaje;
import com.idat.MicroservicioHospedaje.service.HospedajeService;

@Controller
@RequestMapping("/api/turista/v1")
public class HospedajeController {
	
	@Autowired
	private HospedajeService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar (@RequestBody Hospedaje hospedaje) {
		service.guardar(hospedaje);
	}
	
	@PostMapping("/asignar")
	public @ResponseBody void asignar () {
		service.asignarHospedaje();
	}
	
}
