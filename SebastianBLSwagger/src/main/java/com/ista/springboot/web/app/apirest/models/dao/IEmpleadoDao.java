package com.ista.springboot.web.app.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.web.app.apirest.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository  <Empleado, Long> {
	

}
