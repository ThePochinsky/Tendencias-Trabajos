package com.ista.empleados.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.empleados.entity.empleados;


public interface IEmpleadoDao extends CrudRepository  <empleados, Long> {
	

}
