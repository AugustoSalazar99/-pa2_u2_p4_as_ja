package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
@Service
public class CuentaServiceImpl  implements CuentaService{
	@Autowired
	private CuentaRepository cuentaRepository;
	

	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void guarda(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepository.insertar(cuenta);;
	}

	@Override
	public void eliminar(String cedulaPropietario) {
		// TODO Auto-generated method stub
		this.cuentaRepository.eliminar(cedulaPropietario);
	}

	@Override
	public Cuenta seleccionar(String cedulaPropietario) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.seleccionar(cedulaPropietario);
	}

	@Override
	public void realizar(String fechaApertura, String numero, BigDecimal saldo) {
		// TODO Auto-generated method stub
	//logica de negocio	
	}

}
