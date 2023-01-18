package com.ista.springboot.web.app.apirest.models.controllers;

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


import com.ista.springboot.web.app.apirest.models.entity.Empleado;
import com.ista.springboot.web.app.apirest.models.services.IEmpleadoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmpleadoController {
	@Autowired
	private IEmpleadoService empleadoservice;
	
	@GetMapping("/empleadoList")
	public List<Empleado> index(){
		return empleadoservice.findAll();
	}
	
	@GetMapping("/empleadobuscar/{id}")
	public Empleado show(@PathVariable Long id) {
		return empleadoservice.findById(id);
	}
	
	@PostMapping("/empleadosave")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado create(@RequestBody Empleado empleado) {
		return empleadoservice.save(empleado);
		
	}
	
	@PutMapping("/empleadoeditar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody Empleado empleado,   @PathVariable Long id) {
		Empleado empleadoActual= empleadoservice.findById(id);
		empleadoActual.setNombre(empleado.getNombre());
		empleadoActual.setClave(empleado.getClave());
		empleadoActual.setEmail(empleado.getEmail());
		empleadoActual.setEstado(empleado.getEstado());
		
		
		empleadoservice.save(empleadoActual);
		
	}
	@DeleteMapping("/empleadodelete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		empleadoservice.delete(id);
	}
	

}
