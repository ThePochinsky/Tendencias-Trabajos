package com.ista.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.ista.empleados.service.*;
import com.ista.empleados.entity.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmpleadoController {
	@Autowired
	private IEmpleadoService empleadoservice;
	
	@GetMapping("/empleadoList")
	public List<empleados> index(){
		return empleadoservice.findAll();
	}
	
	@GetMapping("/empleadobuscar/{id}")
	public empleados show(@PathVariable Long id) {
		return empleadoservice.findById(id);
	}
	
	@PostMapping("/empleadosave")
	@ResponseStatus(HttpStatus.CREATED)
	public empleados create(@RequestBody empleados empleado) {
		return empleadoservice.save(empleado);
		
	}
	
	@PutMapping("/empleadoeditar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody empleados empleado,   @PathVariable Long id) {
		empleados empleadoActual= empleadoservice.findById(id);
		empleadoActual.setNombre(empleado.getNombre());
		empleadoActual.setApellido(empleado.getApellido());
		empleadoActual.setDireccion(empleado.getDireccion());
		empleadoActual.setTelefono(empleado.getTelefono());
		empleadoActual.setFecha_nacimiento(empleado.getFecha_nacimiento());
		empleadoActual.setObservacion(empleado.getObservacion());
		empleadoActual.setDias_trabajo(empleado.getDias_trabajo());
		empleadoActual.setSueldo(empleado.getSueldo());
		
		
		
		empleadoservice.save(empleadoActual);
		
	}
	@DeleteMapping("/empleadodelete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		empleadoservice.delete(id);
	}
	

}
