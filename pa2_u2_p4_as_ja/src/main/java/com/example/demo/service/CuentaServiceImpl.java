package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CuentaRepository;
import com.example.demo.repository.modelo.Cuenta;
@Service
public class CuentaServiceImpl  implements CuentaService{
	
	@Autowired
	private CuentaRepository cuentaRepository;
	
	@Autowired
	@Qualifier("par")
	private MontoAperturaService montoAperturaService;
	

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
	public void realizar(LocalDateTime fechaApertura, String numero, BigDecimal saldo) {
		// TODO Auto-generated method stub
	Cuenta cta = this.cuentaRepository.seleccionar(numero);
	System.out.println("la cuenta es:"+cta);	
	BigDecimal saldocta =cta.getSaldo();
	
	BigDecimal saldoApert = this.montoAperturaService.calcular(saldocta);
	
	
	
	int dia= fechaApertura.getDayOfMonth();
	
	 if (dia % 2 == 0) {
         // Día par, aumentar el saldo en un 5%
         cta.setSaldo(saldoApert);
         this.cuentaRepository.insertar(cta);
         
        } else {
    	 cta.getSaldo();
    	 this.cuentaRepository.insertar(cta);
           }
	
	}

}
