package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaService {
	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void guarda(Cuenta cuenta);
	public void eliminar(String cedulaPropietario);
	public Cuenta seleccionar(String cedulaPropietario);
	public void realizar(String fechaApertura,String numero, BigDecimal saldo);

}
