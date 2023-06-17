package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Cuenta;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.CiudadanoServiceImpl;
import com.example.demo.service.CuentaService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;


@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {
	
	@Autowired
	private CiudadanoService ciudadanoService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private EstudianteService estudianteService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Ciudadano ciu= new Ciudadano();
		ciu.setApellido("alo");
		ciu.setCedula("1872632");
		ciu.setNombre("jhonatan");
		
		Empleado empleado = new Empleado();
		empleado.setCiudadano(ciu);
		empleado.setCargo("Gerente");
		empleado.setSueldo(new BigDecimal(1500));
		ciu.setEmpleado(empleado);
		this.ciudadanoService.guardar(ciu);
		//this.ciudadanoService.guardar(ciu);
		//System.out.println(ciu);
		
	
		
		
	

		

		
		
	
	}

}
