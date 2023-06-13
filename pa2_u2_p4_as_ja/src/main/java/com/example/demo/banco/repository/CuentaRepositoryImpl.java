package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CuentaRepositoryImpl implements CuentaRepository{

	@PersistenceContext 
	private EntityManager entityManager;
	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}


	@Override
	public void eliminar(String cedulaPropietario) {
		// TODO Auto-generated method stub
		Cuenta c = new Cuenta();
		this.entityManager.remove(c);
	}

	@Override
	public Cuenta seleccionar(String cedulaPropietario) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, cedulaPropietario);
	}



}
