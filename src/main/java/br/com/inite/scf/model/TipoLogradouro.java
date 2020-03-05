/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package br.com.inite.scf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Tipologradouro")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class TipoLogradouro implements Serializable {
	private static final long serialVersionUID = 1L;
	public TipoLogradouro() {
	}
	
	@JsonBackReference
	@OneToMany(mappedBy = "tipologradouro") 
	List<Logradouro> logradouro = new ArrayList<>();
	

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="NomeAbreciado", nullable=true, length=255)	
	private String nomeAbreciado;
	
	@Column(name="ExpressaoRegular", nullable=true, length=255)	
	private String expressaoRegular;
	
	@Column(name="Normalizado", nullable=true, length=11)	
	private Integer normalizado;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;
	

	public void setID(Integer value) {
		this.ID = value;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNomeAbreciado(String value) {
		this.nomeAbreciado = value;
	}
	
	public String getNomeAbreciado() {
		return nomeAbreciado;
	}
	
	public void setExpressaoRegular(String value) {
		this.expressaoRegular = value;
	}
	
	public String getExpressaoRegular() {
		return expressaoRegular;
	}
	
	public void setNormalizado(Integer value) {
		this.normalizado = value;
	}
	
	public Integer getNormalizado() {
		return normalizado;
	}
	
	public void setVersao(Integer value) {
		this.versao = value;
	}
	
	public Integer getVersao() {
		return versao;
	}
	public List<Logradouro> getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(List<Logradouro> logradouro) {
		this.logradouro = logradouro;
	}
	
}
