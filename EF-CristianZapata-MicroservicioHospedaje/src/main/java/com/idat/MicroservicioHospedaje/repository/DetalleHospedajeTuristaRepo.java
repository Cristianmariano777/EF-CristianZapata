package com.idat.MicroservicioHospedaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioHospedaje.model.HospedajeTuristaKF;

@Repository
public interface DetalleHospedajeTuristaRepo extends JpaRepository<HospedajeTuristaKF, Integer>{

}
