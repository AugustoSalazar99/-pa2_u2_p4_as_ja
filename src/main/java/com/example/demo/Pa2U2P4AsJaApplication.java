package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Matricula;


@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {

	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private HabitacionService habitacionService;
	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private AutorService autorService;
	@Autowired
	private MatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Alumno alum = new Alumno();
		alum.setNombre("Yajairo");
		Matricula mat = new Matricula();
		mat.setFecha(LocalDateTime.now());
		mat.setNumero("3");
		mat.set
		
		this.matriculaService.guardar(mat);
		
	}

}