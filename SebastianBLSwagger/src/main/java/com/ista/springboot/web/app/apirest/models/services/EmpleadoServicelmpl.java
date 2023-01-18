package com.ista.springboot.web.app.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.web.app.apirest.models.dao.IEmpleadoDao;
import com.ista.springboot.web.app.apirest.models.entity.Empleado;

@Service
public class EmpleadoServicelmpl implements IEmpleadoService {
	
	@Autowired
	private IEmpleadoDao empleadodao;

	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() {
		return (List<Empleado>)empleadodao.findAll();
	}

	@Override
	@Transactional
	public Empleado save(Empleado empleado) {
		return empleadodao.save(empleado);
	}

	

	@Override
	@Transactional
	public void delete(Long id) {
		empleadodao.deleteById(id);		
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findById(Long id) {
		return empleadodao.findById(id).orElse(null);
	}

}
