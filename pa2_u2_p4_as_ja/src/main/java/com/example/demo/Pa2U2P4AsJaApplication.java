package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;


@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {
	
	

	@Autowired
	private CuentaService cuentaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	
		
		Cuenta cta= new Cuenta();
		cta.setNumero("124578");
		cta.setTipo("corriente");
		cta.setFechaApertura(LocalDateTime.now());
		cta.setSaldo(new BigDecimal(121));
		cta.setCedulaPropietario("7845127854");
		this.cuentaService.guarda(cta);
	

		

		
		
	
	}

}
