package com.ista.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.empleados.dao.*;
import com.ista.empleados.entity.*;

@Service
public class EmpleadoServicelmpl implements IEmpleadoService {
	
	@Autowired
	private IEmpleadoDao empleadodao;

	@Override
	@Transactional(readOnly = true)
	public List<empleados> findAll() {
		return (List<empleados>)empleadodao.findAll();
	}

	@Override
	@Transactional
	public empleados save(empleados empleado) {
		return empleadodao.save(empleado);
	}

	

	@Override
	@Transactional
	public void delete(Long id) {
		empleadodao.deleteById(id);		
	}

	@Override
	@Transactional(readOnly = true)
	public empleados findById(Long id) {
		return empleadodao.findById(id).orElse(null);
	}

}
