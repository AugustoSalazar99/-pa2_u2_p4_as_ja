package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("impar")
public class MontoAperturaImparService implements MontoAperturaService{

	@Override
	public BigDecimal calcular(BigDecimal saldoApertura) {
		// TODO Auto-generated method stub
		return saldoApertura;
	}

}
