package com.uca.capas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table (schema="public", name = "contribuyente")
public class Contribuyente {
	
	@Id
	@GeneratedValue(generator="contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq", allocationSize = 1)
	@Column(name="c_contribuyente")
	private Integer cContribuyente;
	
	
	@Column(name="s_nombre")
	private String sNombre;
	
	@Column(name="s_apellido")
	private String sApellido;
	
	@Column(name="s_nit")
	private String sNit;
	
	@Column(name="f_fecha_ingreso")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fIngreso;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_importancia")
	private Importancia importancia;

	public Contribuyente(Integer cContribuyente, String sNombre, String sApellido, String sNit, Date fIngreso,
			Importancia importancia) {
		super();
		this.cContribuyente = cContribuyente;
		this.sNombre = sNombre;
		this.sApellido = sApellido;
		this.sNit = sNit;
		this.fIngreso = fIngreso;
		this.importancia = importancia;
	}
	
	

	public Contribuyente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getcContribuyente() {
		return cContribuyente;
	}

	public void setcContribuyente(Integer cContribuyente) {
		this.cContribuyente = cContribuyente;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getsNit() {
		return sNit;
	}

	public void setsNit(String sNit) {
		this.sNit = sNit;
	}

	public Date getfIngreso() {
		return fIngreso;
	}

	public void setfIngreso(Date fIngreso) {
		this.fIngreso = fIngreso;
	}

	public Importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(Importancia importancia) {
		this.importancia = importancia;
	}
	
	
}
