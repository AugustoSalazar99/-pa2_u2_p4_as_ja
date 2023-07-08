package com.example.demo.repository.modelo.dto;

import java.util.Objects;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;

public class MatriculaDTO {



	private String nombreAlumno;
	private String nombreMateria;
	
	
	
	
	
	
	public MatriculaDTO() {
		
	}


	public MatriculaDTO(String nombreAlumno, String nombreMateria) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.nombreMateria = nombreMateria;
	}
	
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombreAlumno, nombreMateria);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatriculaDTO other = (MatriculaDTO) obj;
		return Objects.equals(nombreAlumno, other.nombreAlumno) && Objects.equals(nombreMateria, other.nombreMateria);
	}
	
	

}
