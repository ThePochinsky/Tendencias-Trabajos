package com.ista.springboot.web.app.apirest.models.services;

import java.util.List;

import com.ista.springboot.web.app.apirest.models.entity.Empleado;
public interface IEmpleadoService {
	
public List<Empleado> findAll();

public Empleado save(Empleado empleado);

public void delete(Long id);

public Empleado findById(Long id);

	
	
}
