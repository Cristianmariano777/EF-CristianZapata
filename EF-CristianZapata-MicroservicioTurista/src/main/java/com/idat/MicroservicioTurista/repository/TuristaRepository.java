package com.idat.MicroservicioTurista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioTurista.model.TuristaModel;

@Repository
public interface TuristaRepository extends JpaRepository<TuristaModel, Integer>{

	
}
