package com.example.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HotelService;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Autor;

@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {
	
	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;
	@Autowired
	private HotelService hotelService; 
	@Autowired
	private AutorService autorService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Set<Autor> autores=new HashSet<>();
		 
	
		Autor aut = new Autor();
		aut.setNombre("Juan");
		aut.setApellido("Cortez");
		
		Autor aut1 = new Autor();
		aut.setNombre("Jose");
		aut.setApellido("lala");
		
		autores.add(aut);
		autores.add(aut1);
		
		Set<Libro> libros= new HashSet<>();
		
		Libro lib=new Libro();
		lib.setTitulo("El principito");
		lib.setEditorial("Santillana");
	
		libros.add(lib);
	
		lib.setAutores(autores);//aqui por esta cascade en autor
		this.autorService.guardar(aut);
		
		
		
		
	   
		
		
	
	}

}
