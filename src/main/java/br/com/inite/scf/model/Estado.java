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
@Table(name="Estado")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonBackReference
	@OneToMany(mappedBy = "estado") 
	List<Cidade> cidade = new ArrayList<>();
	
	@JsonManagedReference
	@ManyToOne	
	@JoinColumn(name="PaisID")	
	private Pais pais;
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer ID;
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

	public Estado() {
	}
	
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

	List<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}
	public void setPais(br.com.inite.scf.model.Pais value) {
		if (pais != null) {
			pais.estado.remove(this);
		}
		if (value != null) {
			value.estado.add(this);
		}
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
}
