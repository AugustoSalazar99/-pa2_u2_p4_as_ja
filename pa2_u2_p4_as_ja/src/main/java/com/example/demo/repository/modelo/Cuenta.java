package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="cuenta")
public class Cuenta {
	@GeneratedValue(generator = "seq_cuenta",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_cuenta",sequenceName ="seq_cuenta",allocationSize = 1)
	@Id
	@Column(name="cta_id")
	private Integer id;
	@Column(name="cta_numero")
	private String numero;
	@Column(name="cta_tipo")
	private String tipo;
	@Column(name="cta_fechaApertura")
	private LocalDateTime fechaApertura;
	@Column(name="cta_saldo")
	private BigDecimal saldo;
	@Column(name="cta_cedulaPropietario")
	private String cedulaPropietario;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo
				+ ", cedulaPropietario=" + cedulaPropietario + "]";
	}

}
