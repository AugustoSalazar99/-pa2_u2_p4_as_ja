package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante); 
	public void borrar(String cedula);
	public Estudiante buscar(String cedula);
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante buscarPorApellidoTyped(String apellido);

	public List<Estudiante> reporteEstudiante(String apellido);
	public Estudiante buscarPorApellidoyNombre(String apellido,String nombre);


	//name

		public Estudiante reportePorApellidoNamed(String apellido);
		public Estudiante reportePorApellidoNamedQuery(String apellido);
		//native
		public Estudiante reportePorApellidoNativedQuery(String apellido);
		
		public Estudiante reportePorApellidoNativedQueryNamed(String apellido);
		public Estudiante reportePorNombreNativedQuery(String nombre);
		public Estudiante reportePorNombreNativeQueryNamed(String nombre);
	//criteriapi
		
		public Estudiante reportePorApellidoCriterioAPIQuery(String apellido);


		///
		
		public Estudiante reporteDinamico(String nombre,String apellido,Double peso);
		
		public int borrarPorNombre(String nombre);
		public int reporteActualizadoPorApellido(String nombre, String apellido);







}
