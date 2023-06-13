package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("par")
public class MontoAperturaParService implements MontoAperturaService{

	@Override
	public BigDecimal calcular(BigDecimal saldoApertura) {
		// TODO Auto-generated method 
		BigDecimal saldoaum = saldoApertura.multiply(new BigDecimal(5).divide(new BigDecimal(100)));
		return saldoApertura.add(saldoaum);
	}

}
