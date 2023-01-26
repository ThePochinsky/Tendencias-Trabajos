package com.ista.empleados.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class empleados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_empleado;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String fecha_nacimiento;
	private String observacion;
	private int dias_trabajo;
	private double sueldo;
	
	
	public long getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(long id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getDias_trabajo() {
		return dias_trabajo;
	}
	public void setDias_trabajo(int dias_trabajo) {
		this.dias_trabajo = dias_trabajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
