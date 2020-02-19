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
import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cidade")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	public Cidade() {
	}
	
	
	public Cidade(Integer iD, String nome, String nomeCompleto, Integer distrito, String lei, Date dtCriacao,
			Date dtInstalacao, Integer ddd, String siglaDDD, BigDecimal latitude, BigDecimal longitude,
			String cepPadrao, String tipo, Integer brasao, Integer idIbge, Integer idDne, Integer idSerpro,
			Integer normalizado, Integer versao, String complIDIbge, Estado estado) {
		super();
		ID = iD;
		this.nome = nome;
		this.nomeCompleto = nomeCompleto;
		this.distrito = distrito;
		this.lei = lei;
		this.dtCriacao = dtCriacao;
		this.dtInstalacao = dtInstalacao;
		this.ddd = ddd;
		this.siglaDDD = siglaDDD;
		this.latitude = latitude;
		this.longitude = longitude;
		this.cepPadrao = cepPadrao;
		this.tipo = tipo;
		this.brasao = brasao;
		this.idIbge = idIbge;
		this.idDne = idDne;
		IdSerpro = idSerpro;
		this.normalizado = normalizado;
		this.versao = versao;
		this.complIDIbge = complIDIbge;
		this.estado = estado;
	}


	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A88901170181142DA0AC6B")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A88901170181142DA0AC6B", strategy="native")	
	private Integer ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="NomeCompleto", nullable=true, length=255)	
	private String nomeCompleto;
	
	@Column(name="Distrito", nullable=true, length=11)	
	private Integer distrito;
	
	@Column(name="Lei", nullable=true, length=255)	
	private String lei;
	
	@Column(name="DtCriacao", nullable=true)	
	private java.util.Date dtCriacao;
	
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
	private Integer brasao;
	
	@Column(name="IdIbge", nullable=true, length=11)	
	private Integer idIbge;
	
	@Column(name="IdDne", nullable=true, length=11)	
	private Integer idDne;
	
	@Column(name="IdSerpro", nullable=true, length=11)	
	private Integer IdSerpro;
	
	@Column(name="Normalizado", nullable=true, length=11)	
	private Integer normalizado;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;
	
	@Column(name="ComplIDIbge", nullable=true, length=255)	
	private String complIDIbge;
	
	@ManyToOne(targetEntity=Estado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EstadoID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Estado estado;

	public Integer getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
		return IdSerpro;
	}


	public void setIdSerpro(Integer idSerpro) {
		IdSerpro = idSerpro;
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


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (ID != other.ID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cidade [ID=" + ID + ", nome=" + nome + ", nomeCompleto=" + nomeCompleto + ", distrito=" + distrito
				+ ", lei=" + lei + ", dtCriacao=" + dtCriacao + ", dtInstalacao=" + dtInstalacao + ", ddd=" + ddd
				+ ", siglaDDD=" + siglaDDD + ", latitude=" + latitude + ", longitude=" + longitude + ", cepPadrao="
				+ cepPadrao + ", tipo=" + tipo + ", brasao=" + brasao + ", idIbge=" + idIbge + ", idDne=" + idDne
				+ ", IdSerpro=" + IdSerpro + ", normalizado=" + normalizado + ", versao=" + versao + ", complIDIbge="
				+ complIDIbge + ", estado=" + estado + "]";
	}
	

	
	
}
