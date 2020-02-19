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
import java.util.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Estado")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	public Estado() {
	}

public Estado(int iD, String nome, String nomeCompleto, String sigla, Integer brasao, Integer bandeira, Integer idIbge,
		String lei, Date dtCriacao, Date dtInstalacao, Date dtExtincao, String observacao, String tipo, Integer versao,
		Pais pais) {
	super();
	ID = iD;
	this.nome = nome;
	this.nomeCompleto = nomeCompleto;
	this.sigla = sigla;
	this.brasao = brasao;
	this.bandeira = bandeira;
	this.idIbge = idIbge;
	this.lei = lei;
	this.dtCriacao = dtCriacao;
	this.dtInstalacao = dtInstalacao;
	this.dtExtincao = dtExtincao;
	this.observacao = observacao;
	this.tipo = tipo;
	this.versao = versao;
	this.pais = pais;
}
	

	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="NomeCompleto", nullable=true, length=255)	
	private String nomeCompleto;
	
	@Column(name="Sigla", nullable=true, length=255)	
	private String sigla;
	
	@Column(name="Brasao", nullable=true, length=11)	
	private Integer brasao;
	
	@Column(name="Bandeira", nullable=true, length=11)	
	private Integer bandeira;
	
	@Column(name="IdIbge", nullable=true, length=11)	
	private Integer idIbge;
	
	@Column(name="Lei", nullable=true, length=255)	
	private String lei;
	
	@Column(name="DtCriacao", nullable=true)	
	private java.util.Date dtCriacao;
	
	@Column(name="DtInstalacao", nullable=true)	
	private java.util.Date dtInstalacao;
	
	@Column(name="DtExtincao", nullable=true)	
	private java.util.Date dtExtincao;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;
	
	@ManyToOne(targetEntity=Pais.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PaisID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Pais pais;
	
	@OneToMany(mappedBy="estado", targetEntity=Cidade.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Integer getBrasao() {
		return brasao;
	}

	public void setBrasao(Integer brasao) {
		this.brasao = brasao;
	}

	public Integer getBandeira() {
		return bandeira;
	}

	public void setBandeira(Integer bandeira) {
		this.bandeira = bandeira;
	}

	public Integer getIdIbge() {
		return idIbge;
	}

	public void setIdIbge(Integer idIbge) {
		this.idIbge = idIbge;
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

	public java.util.Date getDtExtincao() {
		return dtExtincao;
	}

	public void setDtExtincao(java.util.Date dtExtincao) {
		this.dtExtincao = dtExtincao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
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
		Estado other = (Estado) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estado [ID=" + ID + ", nome=" + nome + ", nomeCompleto=" + nomeCompleto + ", sigla=" + sigla
				+ ", brasao=" + brasao + ", bandeira=" + bandeira + ", idIbge=" + idIbge + ", lei=" + lei
				+ ", dtCriacao=" + dtCriacao + ", dtInstalacao=" + dtInstalacao + ", dtExtincao=" + dtExtincao
				+ ", observacao=" + observacao + ", tipo=" + tipo + ", versao=" + versao + ", pais=" + pais + "]";
	}
	
	
		
}
