package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl  implements MatriculaService{
	@Autowired
	private MatriculaRepository matriculaRepository;

	@Override
	public void guardar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(id);
	}

	@Override
	public Matricula seleccionar(String id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(id);
	}

	@Override
	public List<MatriculaDTO> reporteTodo() {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionarTodo();
	}

}
