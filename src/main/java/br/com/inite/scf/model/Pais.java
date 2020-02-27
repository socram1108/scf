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

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Pais")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;
	public Pais() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A88901170868796770ABC9")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A88901170868796770ABC9", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
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
	
	@Column(name="IdIbge", nullable=true, length=11)	
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
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Cidade.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.List<Cidade> cidade = new ArrayList<>();
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Endereco.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.List<Endereco> endereco = new ArrayList<>();
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Estado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.List<Estado> estado = new ArrayList<>();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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
	
	public void setNomeInternacional(String value) {
		this.nomeInternacional = value;
	}
	
	public String getNomeInternacional() {
		return nomeInternacional;
	}
	
	public void setDdi(int value) {
		setDdi(new Integer(value));
	}
	
	public void setDdi(Integer value) {
		this.ddi = value;
	}
	
	public Integer getDdi() {
		return ddi;
	}
	
	public void setSiglaIso2(String value) {
		this.siglaIso2 = value;
	}
	
	public String getSiglaIso2() {
		return siglaIso2;
	}
	
	public void setSiglaIso3(String value) {
		this.siglaIso3 = value;
	}
	
	public String getSiglaIso3() {
		return siglaIso3;
	}
	
	public void setIdSerpro(int value) {
		setIdSerpro(new Integer(value));
	}
	
	public void setIdSerpro(Integer value) {
		this.idSerpro = value;
	}
	
	public Integer getIdSerpro() {
		return idSerpro;
	}
	
	public void setIdIbge(int value) {
		setIdIbge(new Integer(value));
	}
	
	public void setIdIbge(Integer value) {
		this.idIbge = value;
	}
	
	public Integer getIdIbge() {
		return idIbge;
	}
	
	public void setIdIso(int value) {
		setIdIso(new Integer(value));
	}
	
	public void setIdIso(Integer value) {
		this.idIso = value;
	}
	
	public Integer getIdIso() {
		return idIso;
	}
	
	public void setBandeira(int value) {
		setBandeira(new Integer(value));
	}
	
	public void setBandeira(Integer value) {
		this.bandeira = value;
	}
	
	public Integer getBandeira() {
		return bandeira;
	}
	
	public void setBrasao(int value) {
		setBrasao(new Integer(value));
	}
	
	public void setBrasao(Integer value) {
		this.brasao = value;
	}
	
	public Integer getBrasao() {
		return brasao;
	}
	
	public void setNacionalidade(String value) {
		this.nacionalidade = value;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setVersao(int value) {
		setVersao(new Integer(value));
	}
	
	public void setVersao(Integer value) {
		this.versao = value;
	}
	
	public Integer getVersao() {
		return versao;
	}

	public java.util.List<Estado> getEstado() {
		return estado;
	}

	public void setEstado(java.util.List<Estado> estado) {
		this.estado = estado;
	}

	public java.util.List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(java.util.List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public java.util.List<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(java.util.List<Cidade> cidade) {
		this.cidade = cidade;
	}
	
	
}
