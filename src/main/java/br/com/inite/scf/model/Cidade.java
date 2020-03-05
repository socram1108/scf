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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cidade")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
	public Cidade() {
	}
	
	
	@JsonBackReference
	@OneToMany (mappedBy = "cidade")
	private List<Endereco> endereco = new ArrayList<>();
	
	@JsonBackReference
	@OneToMany(mappedBy = "cidade")
	List<Bairro> bairro = new ArrayList<>();
	
		
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7B9E02E37")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7B9E02E37", strategy="native")	
	private Integer ID;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Estado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EstadoID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Estado estado;
	
	@JsonIgnore
	@ManyToOne(targetEntity=br.com.inite.scf.model.Pais.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PaisID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Pais pais;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="NomeCompleto", nullable=true, length=255)	
	private String nomeCompleto;
	
	@Column(name="Distrito", nullable=true, length=11)	
	private Integer distrito;
	
	@Column(name="Lei", nullable=true, length=255)	
	private String lei;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DtCriacao", nullable=true)	
	private java.util.Date dtCriacao;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DtInstalacao", nullable=true)	
	private java.util.Date dtInstalacao;
	
	@Column(name="Ddd", nullable=true, length=11)	
	private Integer ddd;
	
	@Column(name="SiglaDDD", nullable=true, length=255)	
	private String siglaDDD;
	
	@Column(name="Latitude", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal latitude;
	
	@Column(name="Longitude", nullable=true, precision=19, scale=0)	
	private java.math.BigDecimal longitude;
	
	@Column(name="CepPadrao", nullable=true, length=255)	
	private String cepPadrao;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Brasao", nullable=true, length=11)	
	@Basic(fetch=FetchType.LAZY)	
	private Integer brasao;
	
	@Column(name="IdIbge", nullable=true, length=11)	
	private Integer idIbge;
	
	@Column(name="IdDne", nullable=true, length=11)	
	private Integer idDne;
	
	@Column(name="IdSerpro", nullable=true, length=11)	
	private Integer idSerpro;
	
	@Column(name="Normalizado", nullable=true, length=11)	
	private Integer normalizado;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;
	
	@Column(name="ComplIDIbge", nullable=true, length=255)	
	private String complIDIbge;
		
	public void setID(Integer value) {
		this.ID = value;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Integer getDistrito() {
		return distrito;
	}

	public void setDistrito(Integer distrito) {
		this.distrito = distrito;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public java.util.Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(java.util.Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public java.util.Date getDtInstalacao() {
		return dtInstalacao;
	}

	public void setDtInstalacao(java.util.Date dtInstalacao) {
		this.dtInstalacao = dtInstalacao;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getSiglaDDD() {
		return siglaDDD;
	}

	public void setSiglaDDD(String siglaDDD) {
		this.siglaDDD = siglaDDD;
	}

	public java.math.BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(java.math.BigDecimal latitude) {
		this.latitude = latitude;
	}

	public java.math.BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(java.math.BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getCepPadrao() {
		return cepPadrao;
	}

	public void setCepPadrao(String cepPadrao) {
		this.cepPadrao = cepPadrao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getBrasao() {
		return brasao;
	}

	public void setBrasao(Integer brasao) {
		this.brasao = brasao;
	}

	public Integer getIdIbge() {
		return idIbge;
	}

	public void setIdIbge(Integer idIbge) {
		this.idIbge = idIbge;
	}

	public Integer getIdDne() {
		return idDne;
	}

	public void setIdDne(Integer idDne) {
		this.idDne = idDne;
	}

	public Integer getIdSerpro() {
		return idSerpro;
	}

	public void setIdSerpro(Integer idSerpro) {
		this.idSerpro = idSerpro;
	}

	public Integer getNormalizado() {
		return normalizado;
	}

	public void setNormalizado(Integer normalizado) {
		this.normalizado = normalizado;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public String getComplIDIbge() {
		return complIDIbge;
	}

	public void setComplIDIbge(String complIDIbge) {
		this.complIDIbge = complIDIbge;
	}

	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
			
	public void setEstado(Estado value) {
		if (estado != null) {
			estado.cidade.remove(this);
		}
		if (value != null) {
			value.cidade.add(this);
		}
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public List<Bairro> getBairro() {
		return bairro;
	}

	public void setBairro(List<Bairro> bairro) {
		this.bairro = bairro;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
