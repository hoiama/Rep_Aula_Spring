package br.com.hoiama.curriculos.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idExperiencia;
	private String nomeEmpresa;
	private String experiencia;
	
	
	public long getIdExperiencia() {
		return idExperiencia;
	}

	public void setIdExperiencia(long idExperiencia) {
		this.idExperiencia = idExperiencia;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	
	
	
	
}
