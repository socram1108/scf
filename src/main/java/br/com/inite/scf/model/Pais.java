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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Pais")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	public Pais() {
	}
	
	public Pais(Integer iD, String nome, String nomeCompleto, String nomeInternacional, Integer ddi, String siglaIso2,
			String siglaIso3, Integer idSerpro, Integer idIbge, Integer idIso, Integer bandeira, Integer brasao, String nacionalidade,
			Integer versao) {
		super();
		ID = iD;
		this.nome = nome;
		this.nomeCompleto = nomeCompleto;
		this.nomeInternacional = nomeInternacional;
		this.ddi = ddi;
		this.siglaIso2 = siglaIso2;
		this.siglaIso3 = siglaIso3;
		this.idSerpro = idSerpro;
		this.idIbge = idIbge;
		this.idIso = idIso;
		this.bandeira = bandeira;
		this.brasao = brasao;
		this.nacionalidade = nacionalidade;
		this.versao = versao;
	}
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer ID;
	
	@Column(name="Nome", nullable=false, length=255)	
	private String nome;
	
	@Column(name="NomeCompleto", nullable=true, length=255)	
	private String nomeCompleto;
	
	@Column(name="NomeInternacional", nullable=true, length=255)	
	private String nomeInternacional;
	
	@Column(name="Ddi", nullable=true, length=11)	
	private Integer ddi;
	
	@Column(name="SiglaIso2", nullable=true, length=255)	
	private String siglaIso2;
	
	@Column(name="SiglaIso3", nullable=true, length=255)	
	private String siglaIso3;
	
	@Column(name="IdSerpro", nullable=true, length=11)	
	private Integer idSerpro;
	
	@Column(name="IdIbge", nullable = true, length=11)	
	private Integer idIbge;

	@Column(name="IdIso", nullable=true, length=11)	
	private Integer idIso;
	
	@Column(name="Bandeira", nullable=true, length=11)	
	private Integer bandeira;
	
	@Column(name="Brasao", nullable=true, length=11)	
	private Integer brasao;
	
	@Column(name="Nacionalidade", nullable=true, length=255)	
	private String nacionalidade;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;

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

	public String getNomeInternacional() {
		return nomeInternacional;
	}

	public void setNomeInternacional(String nomeInternacional) {
		this.nomeInternacional = nomeInternacional;
	}

	public Integer getDdi() {
		return ddi;
	}

	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}

	public String getSiglaIso2() {
		return siglaIso2;
	}

	public void setSiglaIso2(String siglaIso2) {
		this.siglaIso2 = siglaIso2;
	}

	public String getSiglaIso3() {
		return siglaIso3;
	}

	public void setSiglaIso3(String siglaIso3) {
		this.siglaIso3 = siglaIso3;
	}

	public Integer getIdSerpro() {
		return idSerpro;
	}

	public void setIdSerpro(Integer idSerpro) {
		this.idSerpro = idSerpro;
	}

	public Integer getIdIbge() {
		return idIbge;
	}

	public void setIdIbge(Integer idIbge) {
		this.idIbge = idIbge;
	}

	public Integer getIdIso() {
		return idIso;
	}

	public void setIdIso(Integer idIso) {
		this.idIso = idIso;
	}

	public Integer getBandeira() {
		return bandeira;
	}

	public void setBandeira(Integer bandeira) {
		this.bandeira = bandeira;
	}

	public Integer getBrasao() {
		return brasao;
	}

	public void setBrasao(Integer brasao) {
		this.brasao = brasao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
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
		Pais other = (Pais) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pais [ID=" + ID + ", nome=" + nome + ", nomeCompleto=" + nomeCompleto + ", nomeInternacional="
				+ nomeInternacional + ", ddi=" + ddi + ", siglaIso2=" + siglaIso2 + ", siglaIso3=" + siglaIso3
				+ ", idSerpro=" + idSerpro + ", idIbge=" + idIbge + ", idIso=" + idIso + ", bandeira=" + bandeira
				+ ", brasao=" + brasao + ", nacionalidade=" + nacionalidade + ", versao=" + versao + "]";
	}
	
	
}