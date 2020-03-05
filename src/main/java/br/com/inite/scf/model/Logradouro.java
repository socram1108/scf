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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Logradouro")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Logradouro implements Serializable {
	private static final long serialVersionUID = 1L;
	public Logradouro() {
	}
	
	@JsonBackReference
	@OneToMany(mappedBy = "logradouro")	
	private List<Endereco> endereco = new ArrayList<Endereco>();
	

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer ID;
	
	@JsonManagedReference
	@ManyToOne	
	@JoinColumn(name="TipologradouroID")	
	private TipoLogradouro tipologradouro;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="NomeCompleto", nullable=true, length=255)	
	private String nomeCompleto;
	
	@Column(name="NomeComplemento", nullable=true, length=255)	
	private String nomeComplemento;
	
	@Column(name="IdCidade", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal idCidade;
	
	@Column(name="Latitude", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal latitude;
	
	@Column(name="Longitude", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal longitude;
	
	@Column(name="IdDne", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal idDne;
	
	@Column(name="Normalizado", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal normalizado;
	
	@Column(name="Versao", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal versao;
	
	@Column(name="Cep", nullable=true, length=255)	
	private String cep;
	
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
	
	public void setNomeCompleto(String value) {
		this.nomeCompleto = value;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeComplemento(String value) {
		this.nomeComplemento = value;
	}
	
	public String getNomeComplemento() {
		return nomeComplemento;
	}
	
	public void setIdCidade(java.math.BigDecimal value) {
		this.idCidade = value;
	}
	
	public java.math.BigDecimal getIdCidade() {
		return idCidade;
	}
	
	public void setLatitude(java.math.BigDecimal value) {
		this.latitude = value;
	}
	
	public java.math.BigDecimal getLatitude() {
		return latitude;
	}
	
	public void setLongitude(java.math.BigDecimal value) {
		this.longitude = value;
	}
	
	public java.math.BigDecimal getLongitude() {
		return longitude;
	}
	
	public void setIdDne(java.math.BigDecimal value) {
		this.idDne = value;
	}
	
	public java.math.BigDecimal getIdDne() {
		return idDne;
	}
	
	public void setNormalizado(java.math.BigDecimal value) {
		this.normalizado = value;
	}
	
	public java.math.BigDecimal getNormalizado() {
		return normalizado;
	}
	
	public void setVersao(java.math.BigDecimal value) {
		this.versao = value;
	}
	
	public java.math.BigDecimal getVersao() {
		return versao;
	}
	
	public void setCep(String value) {
		this.cep = value;
	}
	
	public String getCep() {
		return cep;
	}
	

	public void setTipologradouro(br.com.inite.scf.model.TipoLogradouro value) {
		if (tipologradouro != null) {
			tipologradouro.logradouro.remove(this);
		}
		if (value != null) {
			value.logradouro.add(this);
		}
	}
	
	public br.com.inite.scf.model.TipoLogradouro getTipologradouro() {
		return tipologradouro;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
}
