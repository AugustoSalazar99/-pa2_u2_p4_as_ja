package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {
	
	@Autowired
	private  EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante es= new Estudiante();
		
		es.setNombre("Jhon");
		es.setApellido("Arteaga");
		es.setCedula("2323121457");
		
		Estudiante est= new Estudiante();
		
		est.setNombre("Augusto");
		est.setApellido("Salazar");
		est.setCedula("2023121457");
		
		Estudiante estu= new Estudiante();
		
		estu.setNombre("Jairo");
		estu.setApellido("Salazar");
		estu.setCedula("2553121457");
		
	/*	this.estudianteService.guardar(es);
		this.estudianteService.guardar(est);
		this.estudianteService.guardar(estu);
*/
		
	   //eliminar
		//this.estudianteService.borrar("2323121457");
		
		//Actualizar
		est.setNombre("Yajairo");
		this.estudianteService.Actualizar(est);
		
		
	
	}

}
