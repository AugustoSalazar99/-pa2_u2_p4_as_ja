package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import aj.org.objectweb.asm.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements MatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(matricula);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Matricula mat= this.buscar(id);
		this.entityManager.remove(mat);
	}

	@Override
	public Matricula buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Matricula.class, id);
	}

	@Override
	public List<MatriculaDTO> seleccionarTodo() {
		// TODO Auto-generated method
		
		TypedQuery<MatriculaDTO> myQuery=this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(m.estudiante.nombre,m.materia.nombre) FROM Matricula m"
				,MatriculaDTO.class
				
				
				);
		
		
		return myQuery.getResultList();
	}

}
