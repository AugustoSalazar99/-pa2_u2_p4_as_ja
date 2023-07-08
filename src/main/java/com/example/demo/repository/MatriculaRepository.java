package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

public interface MatriculaRepository {
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void eliminar(String id);
	public Matricula buscar(String id);
	
	
	public List<MatriculaDTO> seleccionarTodo();

}
