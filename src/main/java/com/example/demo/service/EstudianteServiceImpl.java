package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(cedula);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscar(cedula);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		
		return this.estudianteRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> reporteEstudiante(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Estudiante buscarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante reportePorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoNamed(apellido);
	}

	@Override
	public Estudiante reportePorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante reportePorApellidoNativedQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.selecionarPorApellidoNativedQuery(apellido);
	}

	@Override
	public Estudiante reportePorApellidoNativedQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.selecionarPorApellidoNativedQueryNamed(apellido);
	}

	@Override
	public Estudiante reportePorNombreNativedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante reportePorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.selecionarPorNombreNativeQueryNamed(nombre);
	}

	@Override
	public Estudiante reportePorApellidoCriterioAPIQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.selecionarPorApellidoCriterioAPIQuery(apellido);
	}

	@Override
	public Estudiante reporteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarDinamico(nombre, apellido, peso);
	}

	@Override
	public int borrarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.eliminarPorNombre(nombre);
	}

	@Override
	public int reporteActualizadoPorApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.actualizarPorApellido(nombre, apellido);
	}

	@Override
	public List<EstudianteDTO> reporteTodosDTO() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarTodosDTO();
	}

	

	

	


}
