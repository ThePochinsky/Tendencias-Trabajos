package com.ista.empleados.service;

import java.util.List;

import com.ista.empleados.entity.empleados;


public interface IEmpleadoService {
	
public List<empleados> findAll();

public empleados save(empleados empleado);

public void delete(Long id);

public empleados findById(Long id);

	
	
}
