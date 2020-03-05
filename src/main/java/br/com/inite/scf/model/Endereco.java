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

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Endereco")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	public Endereco() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id
	@GeneratedValue(generator="VC0A8890117084422E3E08A78")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117084422E3E08A78", strategy="native")	
	private Integer ID;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Bairro.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="BairroID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Bairro bairro;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Logradouro.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="LogradouroID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Logradouro logradouro;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Cidade.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CidadeID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Cidade cidade;
	
	@Column(name="Numero", nullable=true, length=255)	
	private String numero;
	
	@Column(name="Complemento", nullable=true, length=255)	
	private String complemento;
	
	@Column(name="Cep", nullable=true, length=255)	
	private String cep;
	
	@Column(name="Longitude", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal longitude;
	
	@Column(name="Latitude", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal latitude;
	
	@Column(name="IdDne", nullable=true, length=11)	
	private Integer idDne;
	
	@Column(name="Normalizado", nullable=true, length=11)	
	private Integer normalizado;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;
	
	@Column(name="TipoLocalizacao", nullable=true, length=255)	
	private String tipoLocalizacao;
	
	@Column(name="PontoReferencia", nullable=true, length=255)	
	private String pontoReferencia;
	
	@JsonBackReference
	@ManyToMany(mappedBy="endereco", targetEntity=br.com.inite.scf.model.Pessoa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@OrderBy(value="ID")	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private List<Pessoa> pessoa = new ArrayList<>();
	
	public void setID(Integer value) {
		this.ID = value;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public void setNumero(String value) {
		this.numero = value;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setComplemento(String value) {
		this.complemento = value;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setCep(String value) {
		this.cep = value;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setLongitude(java.math.BigDecimal value) {
		this.longitude = value;
	}
	
	public java.math.BigDecimal getLongitude() {
		return longitude;
	}
	
	public void setLatitude(java.math.BigDecimal value) {
		this.latitude = value;
	}
	
	public java.math.BigDecimal getLatitude() {
		return latitude;
	}
	
	public void setIdDne(Integer value) {
		this.idDne = value;
	}
	
	public Integer getIdDne() {
		return idDne;
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
	
	public void setTipoLocalizacao(String value) {
		this.tipoLocalizacao = value;
	}
	
	public String getTipoLocalizacao() {
		return tipoLocalizacao;
	}
	
	public void setPontoReferencia(String value) {
		this.pontoReferencia = value;
	}
	
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	
	public void setBairro(br.com.inite.scf.model.Bairro value) {
		if (bairro != null) {
			bairro.endereco.remove(this);
		}
		if (value != null) {
			value.endereco.add(this);
		}
	}
	
	public br.com.inite.scf.model.Bairro getBairro() {
		return bairro;
	}
	
	public void setLogradouro(br.com.inite.scf.model.Logradouro value) {
		if (logradouro != null) {
			logradouro.getEndereco().remove(this);
		}
		if (value != null) {
			value.getEndereco().add(this);
		}
	}
	
	public br.com.inite.scf.model.Logradouro getLogradouro() {
		return logradouro;
	}
	
	public void setCidade(br.com.inite.scf.model.Cidade value) {
		if (cidade != null) {
			cidade.getEndereco().remove(this);
		}
		if (value != null) {
			value.getEndereco().add(this);
		}
	}
	
	public br.com.inite.scf.model.Cidade getCidade() {
		return cidade;
	}
	

}
